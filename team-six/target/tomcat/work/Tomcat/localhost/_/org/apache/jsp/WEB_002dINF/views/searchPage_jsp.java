/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-04-28 00:24:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class searchPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Social Network</title>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha256-7s5uDGW3AHqw6xtJmNNtr+OBRJUlgkNJEo78P4b0yRw= sha512-nNo+yCHEyn0smMxSswnf/OnX6/KwJuZTlNZBjauKhTK0c+zT+q5JOCx0UFhXQ6rJR9jg6Es8gPuD2uZcYDLqSw==\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction doAdd(one) {\r\n");
      out.write("\r\n");
      out.write("\t\t//alert(\"do add one : \"+one);\r\n");
      out.write("\t\tvar addData = $(\"#\" + one).serializeArray();\r\n");
      out.write("\t\tvar dataObj = {};\r\n");
      out.write("\t\tfor (var i = 0; i < addData.length; i++) {\r\n");
      out.write("\t\t\tvar var2 = addData[i].value;\r\n");
      out.write("\t\t\tdataObj[addData[i].name] = var2;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar json = JSON.stringify(dataObj);\r\n");
      out.write("\t\t//alert(\"do add json : \"+json);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\theaders : {\r\n");
      out.write("\t\t\t\t'Accept' : 'application/json',\r\n");
      out.write("\t\t\t\t'Content-Type' : 'application/json'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\turl : \"/SE-project-team-six/searchPage/addFriend\",\r\n");
      out.write("\t\t\tdata : json,\r\n");
      out.write("\t\t\terror : function(xhr, err) {\r\n");
      out.write("\t\t\t\talert(\"readyState: \" + xhr.readyState + \"\\nstatus: \"\r\n");
      out.write("\t\t\t\t\t\t+ xhr.status);\r\n");
      out.write("\t\t\t\talert(\"responseText: \" + xhr.responseText + \" \" + err);\r\n");
      out.write("\t\t\t\tconsole.log(xhr.responseText);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess : function(response) {\r\n");
      out.write("\t\t\t\talert(\"Friend Request Sent !!\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doSearch() {\r\n");
      out.write("\r\n");
      out.write("\t\tvar fromData = $('#post_form').serializeArray();\r\n");
      out.write("\t\tvar dataObj = {};\r\n");
      out.write("\t\tfor (var i = 0; i < fromData.length; i++) {\r\n");
      out.write("\t\t\tvar var2 = fromData[i].value;\r\n");
      out.write("\t\t\tdataObj[fromData[i].name] = var2;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar json = JSON.stringify(dataObj);\r\n");
      out.write("\t\t//alert(json);\r\n");
      out.write("\t\t$\r\n");
      out.write("\t\t\t\t.ajax({\r\n");
      out.write("\t\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\t'Accept' : 'application/json',\r\n");
      out.write("\t\t\t\t\t\t'Content-Type' : 'application/json'\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\turl : \"/SE-project-team-six/searchPage/doSearch\",\r\n");
      out.write("\t\t\t\t\tdata : json,\r\n");
      out.write("\t\t\t\t\terror : function(xhr, err) {\r\n");
      out.write("\t\t\t\t\t\talert(\"readyState: \" + xhr.readyState + \"\\nstatus: \"\r\n");
      out.write("\t\t\t\t\t\t\t\t+ xhr.status);\r\n");
      out.write("\t\t\t\t\t\talert(\"responseText: \" + xhr.responseText + \" \" + err);\r\n");
      out.write("\t\t\t\t\t\tconsole.log(xhr.responseText);\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsuccess : function(response) {\r\n");
      out.write("\t\t\t\t\t\t/* $(\r\n");
      out.write("                        '<hr size=\"100\" id=\"searchtext\" width=\"100%\" noshade style=\"color:#000000padding-top:05px;margin-bottom:05px;\" align=\"left\" /><br><h3> Search Result Displayed below </h3>')\r\n");
      out.write("                        .appendTo(\"#try1\"); */\r\n");
      out.write("                jQuery('#try1 div').html('');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < response.searchResult.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\tvar var1 = response.searchResult[i].fullName;\r\n");
      out.write("\t\t\t\t\t\t\tvar var2 = response.searchResult[i].emailId;\r\n");
      out.write("\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'<form name=\"add_form\" id=\"'+i+'\" action=\"\" method=\"POST\"><div class=\"form-group-sm col-sm-6\"><label for=\"locationSearch\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ var1\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t + '</label><input type=\"text\" name=\"addFriend\" style=\"margin-bottom:5px;\" class=\"form-control\" id=\"addFriend\" value=\"'+ var2 + '\" \"><button type=\"button\" name=\"addFriend\"  value=\"addFriend\" style=\"padding-left:15px;margin-bottom:25px;\"id=\"addFriend\" class=\"btn btn-primary\" onclick=\"doAdd('\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ ');\"> Add Friend </button></div></form>')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.appendTo(\"#try1\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t//  \tgobal=response.searchResult;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t//  $(\"c\\\\:forEach\").attr(\"items\", response.searchResult );\r\n");
      out.write("\t\t\t\t\t\t// document.getElementsByTagName(\"c\\\\:forEach\").items(response.searchResult);\r\n");
      out.write("\t\t\t\t\t\twindow.location.hash = \"#try1\";\r\n");
      out.write("\t\t\t\t\t\t// document.form.y.items = response.searchResult;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Navigator for the website, Home is active. Once finalised override -->\r\n");
      out.write("\t<!-- Navigator for the website, Home is active. Once finalised override -->\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- To cover the complete width -->\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand\" >Social network</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"profilePage\">Home Page</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"myProfilePage\">Profile Page</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"searchPage\">Search Friend</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t</div><!-- /.navbar-collapse -->\r\n");
      out.write("\t\t</div><!-- /.container-fluid -->\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\t\t\r\n");
      out.write(" \t <div class=\"container\" style=\"padding-left:25px;\">  \t\r\n");
      out.write("\t\t\t <a href=\"backgroundPicture\"><img src=\"data:image/jpeg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.backgroundPicture}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"position:absolute;\r\n");
      out.write("\t\tleft:200px;\r\n");
      out.write("\t\ttop:50px;\r\n");
      out.write("\t\tz-index:0;\r\n");
      out.write("\t\tborder: 2px solid grey;\" width=75% height=350px   alt=\"[]\" ></a>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    <a href=\"profilePicture\"><img src=\"data:image/jpeg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.profilePicture}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"position:relative;\r\n");
      out.write("\t\tleft:30px;\r\n");
      out.write("\t\ttop:30px;\r\n");
      out.write("\t\tz-index:1;border: 2px solid grey;\" width=250px height=250px alt=\"[]\" /></a>\r\n");
      out.write("\t\t<h2 style=\"position:relative;\r\n");
      out.write("\t\tleft:30px;\r\n");
      out.write("\t\ttop: 20px;\r\n");
      out.write("\t\tz-index:1; color: white;\">\r\n");
      out.write("       \t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.fullName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("    \t</h2>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\" style=\"position: relative; padding-top: 100px;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"left\" class=\"row col-lg-9\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form name=\"post_form\" id=\"post_form\" action=\"\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<hr size=\"100\" width=\"100%\" noshade style=\"color: #000000\"\r\n");
      out.write("\t\t\t\t\t\talign=\"left\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<h3>Search Friend</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group-lg col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"nameSearch\">Name</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"nameSearch\" class=\"form-control\" id=\"nameSearch\"\r\n");
      out.write("\t\t\t\t\t\t\t\tPlaceholder=\"Search by name \">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group-lg col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"locationSearch\">Location</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"locationSearch\" class=\"form-control\" id=\"locationSearch\"\r\n");
      out.write("\t\t\t\t\t\t\t\tPlaceholder=\"Search by location \">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group-lg col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"schoolSearch\">School</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"schoolSearch\" class=\"form-control\" id=\"schoolSearch\"\r\n");
      out.write("\t\t\t\t\t\t\t\tPlaceholder=\"Search by school \">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<!-- <div class=\"form-group-lg col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"professionSearch\">Profession</label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" name=\"professionSearch\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"professionSearch\" Placeholder=\"Search by profession \">\r\n");
      out.write("\t\t\t\t\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row text-left col-lg-12\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"padding-top: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label><h3></h3></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" name=\"post\" value=\"post\" id=\"post\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary\" onclick=\"doSearch()\">Click to\r\n");
      out.write("\t\t\t\t\t\t\t\t\tSearch</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"try1\">\r\n");
      out.write("            <hr size=\"100\" id=\"searchtext\" width=\"100%\" noshade style=\"color:#000000padding-top:05px;margin-bottom:05px;\" align=\"left\" /><br><h3> Search Results </h3>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"recommendblock\">\r\n");
      out.write("\t\t\t\t<p>Recommended friends</p>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<form name=\"add_form\" id=\"add_form\" action=\"\" method=\"POST\"></form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form name=\"logout_form\" id=\"logout_form\"\r\n");
      out.write("                action=\"/SE-project-team-six/do_logout\" method=\"POST\">\r\n");
      out.write("                <div class=\"form-group row text-right col-lg-3\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <button type=\"submit\" name=\"logoutbutton\" value=\"logoutbutton\"\r\n");
      out.write("                            id=\"logoutbutton\" class=\"btn btn-primary pull-right\">Logout</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/searchPage.jsp(219,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(recommendedResult) eq 0}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <p>There are currently no friend suggestions!</p>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/searchPage.jsp(224,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/searchPage.jsp(224,5) '${recommendedResult}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${recommendedResult}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/searchPage.jsp(224,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("u");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <form name=\"add_form1\" id=\"$(u)\" action=\"\" method=\"GET\">\r\n");
          out.write("                        <div class=\"form-group-sm col-sm-12\"\r\n");
          out.write("                            style=\"display: inline block;\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.fullName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                            <label for=\"locationSearch1\"> </label>\r\n");
          out.write("                            <div class=\"form-group-sm col-sm-9\" style=\"display: inline block\">\r\n");
          out.write("                                <p align=\"left\" style=\"padding-top: 05px; margin-bottom: 5px;\"\r\n");
          out.write("                                    class=\"form-control\" id=\"addFriend1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.fullName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"form-group-sm col-sm-3\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<button align=\"right\" type=\"submit\" name=\"addFriend\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\tvalue=\"addFriend\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\tstyle=\"padding-left: 15px; margin-bottom: 25px;\" id=\"addFriend\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary\" onclick=\"doAdd('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("')\">Add\r\n");
          out.write("\t\t\t\t\t\t\t\t\tFriend</button>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t<br>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</form>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
