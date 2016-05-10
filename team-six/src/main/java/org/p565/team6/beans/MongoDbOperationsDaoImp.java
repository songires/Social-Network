package org.p565.team6.beans;

import java.util.ArrayList;
import java.util.List;

import org.omg.PortableServer.ServantActivatorHelper;
import org.p565.team6.model.AddFriendModel;
import org.p565.team6.model.LastValueModel;
import org.p565.team6.model.NameAndComment;
import org.p565.team6.model.NewPostModel;
import org.p565.team6.model.RegisterModel;
import org.p565.team6.model.SearchModel;
import org.p565.team6.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.BasicDBObject;

public class MongoDbOperationsDaoImp implements MongoDbOperationsDao {

	private MongoOperations mongoOps;
		
	
	public MongoDbOperationsDaoImp(MongoOperations mongoOps){
        this.mongoOps=mongoOps;
    }
	
	@Override
	public Object searchOne(String searchField, String searchValue, String searchCollections) {
		// TODO Auto-generated method stub
		
		Query query = new Query(Criteria.where(searchField).is(searchValue));
		Object t1 = this.mongoOps.findOne(query, Object.class,searchCollections );
		return t1;
	}
	
	@Override
	public UserModel searchOneUserModel(String searchField, String searchValue, String searchCollections) {
		// TODO Auto-generated method stub
		
		Query query = new Query(Criteria.where(searchField).is(searchValue));
		System.out.println(query);
		UserModel t1 = this.mongoOps.findOne(query, UserModel.class,searchCollections );
		return t1;
	}
	
	@Override
	public boolean insertOne(Object object,String collectionName) {
		// TODO Auto-generated method stub
		
		this.mongoOps.insert(object,collectionName);
		return false;
	}
	
	@Override
	public boolean insertOneFile(Object object,String collectionName)
	{
		
		return false;
		
	}

	@Override
	public Object searchOneProfile(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<NewPostModel> searchPost(String searchField, ArrayList<String> searchList, String searchCollections) {
		// TODO Auto-generated method stub
		
		Query query = new Query(Criteria.where(searchField).in(searchList));
		query.with(new Sort(Direction.DESC, "_id"));
		query.limit(10);
		System.out.println(" query for post "+query.toString());
		ArrayList<NewPostModel> t1 = (ArrayList<NewPostModel>)this.mongoOps.find(query, NewPostModel.class,searchCollections );
		return t1;
	}

	@Override
	public Object searchFriend(SearchModel searchModel, String searchCollections) {
		// TODO Auto-generated method stub
		Criteria criteria = new Criteria();
        criteria.orOperator(Criteria.where("fullName").is(searchModel.getNameSearch())
        		,Criteria.where("address").is(searchModel.getLocationSearch())
        		,Criteria.where("school").is(searchModel.getSchoolSearch()));
        
		Query query1 = new Query(criteria);
		ArrayList<UserModel> t1 = (ArrayList<UserModel>)this.mongoOps.find(query1, UserModel.class,searchCollections );
		return t1;
	}

	@Override
	public Object updateUserModel(AddFriendModel addFriendModel, AddFriendModel currentUser) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(addFriendModel.getAddFriend()));
		System.out.println("search query"+query.toString());
		Update update = new Update();
		update.addToSet("pendingFriendList", currentUser);
		mongoOps.findAndModify(query, update, UserModel.class, "UserModel");
		return null;
	}

	@Override
	public void findAndRemoveArray(String searchValue, String setSearchValue, String searchFeild, String setSearchFeild,
			String Collection) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(searchValue));
		Update update = new Update();
		update.pull(setSearchFeild, new BasicDBObject("addFriend", setSearchValue));
		mongoOps.findAndModify(query, update, UserModel.class, Collection);
		
	}
	
	
	@Override
	public void findAndUpdatePass(String emailToBeupdated, String newPass, String FeildToBeUpdate,String Collection) {
		// TODO Auto-generated method stub
		
		System.out.println("-----");
		Query query = new Query(Criteria.where("_id").is(emailToBeupdated));
		Update update = new Update();
		update.set(FeildToBeUpdate, newPass);
		
		System.out.println("pass reset query"+query.toString());
		mongoOps.findAndModify(query, update, UserModel.class, Collection);
		
	}

	@Override
	public void findAndAddToSet(String userEmail, String acceptEmail) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(userEmail));
		System.out.println("add Query "+query);
		Update update = new Update();
		update.addToSet("usersFriendList", acceptEmail);
		mongoOps.findAndModify(query, update, UserModel.class, "UserModel");
	}

	@Override
	public int findLastValue(String collectinsName) {
		// TODO Auto-generated method stub
		List<LastValueModel> t1 = mongoOps.findAll(LastValueModel.class,collectinsName );
		 return t1.get(0).getLastIndexValue();
	}

	@Override
	public void updateLastValue(String collectinsName, int value) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("lastIndexValue").is(value));
		Update update = new Update();
		update.set("lastIndexValue", value+1);
		mongoOps.findAndModify(query, update, LastValueModel.class, collectinsName);
	}

	@Override
	public void likeAPost(String userEmail, int postId, String collections) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(postId));
		Update update = new Update();
		update.addToSet("likedBy", userEmail);
		mongoOps.findAndModify(query, update, NewPostModel.class, collections);
	}

	@Override
	public void addComment(String commentText, int index, String commentedBy,String collections) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(index));
		Update update = new Update();
		NameAndComment nameAndComment = new NameAndComment();
		nameAndComment.setCommentedBy(commentedBy);
		nameAndComment.setCommentText(commentText);
		update.addToSet("comments", nameAndComment);
		mongoOps.findAndModify(query, update, NewPostModel.class, collections);
	}

	@Override
	public void findAndAddToSetObject(String userEmail, UserModel currentUser) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(userEmail));
		Update update = new Update();
		update.addToSet("friendDetails", currentUser);
		mongoOps.findAndModify(query, update, UserModel.class, "UserModel");
		
	}

	
	@Override
	public UserModel searchOneUser(String searchField, String searchValue, String searchCollections) {
		Query query = new Query(Criteria.where(searchField).is(searchValue));
		UserModel t1 = this.mongoOps.findOne(query, UserModel.class,searchCollections );
		return t1;
	}

	@Override
	public boolean updateOne(String searchField, String searchValue,Object object,String collectionName){
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where(searchField).is(searchValue));
		Update update = new Update();
		if(((UserModel) object).getFullName().length() > 0){
			update.set("fullName", ((UserModel) object).getFullName());
		}
		if(((UserModel) object).getSchool().length() > 0){
			update.set("school", ((UserModel) object).getSchool());
		}
		if(((UserModel) object).getDob().length() > 0){
			update.set("dob", ((UserModel) object).getDob());
		}
		if(((UserModel) object).getGender().length() > 0){
			update.set("gender", ((UserModel) object).getGender());
		}
		if(((UserModel) object).getSecurityQuestion1().length() > 0){
			update.set("securityQuestion1", ((UserModel) object).getSecurityQuestion1());
		}
		if(((UserModel) object).getSecurityQuestion2().length() > 0){
			update.set("securityQuestion2", ((UserModel) object).getSecurityQuestion2());
		}
		if(((UserModel) object).getPhoneNumber().length() > 0){
			update.set("phoneNumber", ((UserModel) object).getPhoneNumber());
		}
		if(((UserModel) object).getAddress().length() > 0){
			update.set("address", ((UserModel) object).getAddress());
		}
		if(((UserModel) object).getPassword().length() > 0){
			update.set("password", ((UserModel) object).getPassword());
		}
		update.set("backgroundPicture", ((UserModel) object).getBackgroundPicture());
		update.set("profilePicture", ((UserModel) object).getProfilePicture());
		
		
		this.mongoOps.updateFirst(query,update,collectionName);
		return false;
	}



}



