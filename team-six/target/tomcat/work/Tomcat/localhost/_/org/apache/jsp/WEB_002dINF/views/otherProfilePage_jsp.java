/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-04-28 00:39:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class otherProfilePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Social Network</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Bootstrap -->\r\n");
      out.write(" \t<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha256-7s5uDGW3AHqw6xtJmNNtr+OBRJUlgkNJEo78P4b0yRw= sha512-nNo+yCHEyn0smMxSswnf/OnX6/KwJuZTlNZBjauKhTK0c+zT+q5JOCx0UFhXQ6rJR9jg6Es8gPuD2uZcYDLqSw==\" crossorigin=\"anonymous\">\r\n");
      out.write("\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\tfunction likeThePost(postId){\r\n");
      out.write("\t\tdata1 = { index : postId };\r\n");
      out.write("\t\tvar json = JSON.stringify(data1);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t headers: { \r\n");
      out.write("\t\t\t        'Accept': 'application/json',\r\n");
      out.write("\t\t\t        'Content-Type': 'application/json' \r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t    dataType : \"json\",\r\n");
      out.write("\t    type: \"POST\",\r\n");
      out.write("\t    async:false,\r\n");
      out.write("\t    url: \"/SE-project-team-six/homePage/like\",\r\n");
      out.write("\t    data: json,\r\n");
      out.write("\t    error: function(xhr,err){\r\n");
      out.write("\t        alert(\"readyState: \"+xhr.readyState+\"\\nstatus: \"+xhr.status);\r\n");
      out.write("\t        alert(\"responseText: \"+xhr.responseText+\" \"+err);\r\n");
      out.write("\t     },\r\n");
      out.write("\t    success: function(response){\r\n");
      out.write("\t       window.location.href = response.moveTo;\r\n");
      out.write("\t     \tcallBack(postId);  \r\n");
      out.write("\t      }\r\n");
      out.write("\t    });\r\n");
      out.write("\t  }\r\n");
      out.write("\t  \r\n");
      out.write("\t  function callBack(postId){\r\n");
      out.write("\t\t  \r\n");
      out.write("\t  }\tfunction showLikes(likeId){\r\n");
      out.write("\t\t$('#'+likeId).toggle();\r\n");
      out.write("\t  }\r\n");
      out.write("\t\t  \r\n");
      out.write("\tfunction showComments(commentId){\r\n");
      out.write("\t\t//alert('#'+commentId);\r\n");
      out.write("\t\t$('#'+commentId).toggle();\r\n");
      out.write("\t  }\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$('#newPost').val('');\r\n");
      out.write("\t\t$(\"#basicInfo\").hide();\r\n");
      out.write("\t\t$(\"#contactInfo\").hide();\r\n");
      out.write("\t\t$(\"#oldPosts\").hide();\r\n");
      out.write("\t})\r\n");
      out.write("\tfunction doBasic(){\r\n");
      out.write("\t\r\n");
      out.write("\t\t$(\"#basicInfo\").show();\r\n");
      out.write("\t\t$(\"#contactInfo\").hide();\r\n");
      out.write("\t\t$(\"#oldPosts\").hide();\r\n");
      out.write("    \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doContact(){\r\n");
      out.write("\t\t$(\"#basicInfo\").hide();\r\n");
      out.write("\t\t$(\"#contactInfo\").show();\r\n");
      out.write("\t\t$(\"#oldPosts\").hide();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doOldPost(){\r\n");
      out.write("\t\t$(\"#basicInfo\").hide();\r\n");
      out.write("\t\t$(\"#contactInfo\").hide();\r\n");
      out.write("\t\t$(\"#oldPosts\").show();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doAdd(one,two){\r\n");
      out.write("\t\r\n");
      out.write("\tdata1 = { addFriend : one , name : two };\r\n");
      out.write("\t\tvar json = JSON.stringify(data1);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t headers: { \r\n");
      out.write("\t\t\t        'Accept': 'application/json',\r\n");
      out.write("\t\t\t        'Content-Type': 'application/json' \r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t   dataType : \"json\",\r\n");
      out.write("\t   type: \"POST\",\r\n");
      out.write("\t   url: \"/SE-project-team-six/searchPage/addFriend\",\r\n");
      out.write("\t   data: json,\r\n");
      out.write("\t   error: function(xhr,err){\r\n");
      out.write("\t       alert(\"readyState: \"+xhr.readyState+\"\\nstatus: \"+xhr.status);\r\n");
      out.write("\t       alert(\"responseText: \"+xhr.responseText+\" \"+err);\r\n");
      out.write("\t\t    console.log(xhr.responseText);\r\n");
      out.write("\t   },\r\n");
      out.write("\t   success: function(response){\r\n");
      out.write("\t   \talert(\"Friend Request Sent !!\");\r\n");
      out.write("\t   \t }\r\n");
      out.write("\t   });\r\n");
      out.write("\t\t\r\n");
      out.write("\t   }\r\n");
      out.write("\t\r\n");
      out.write("function doPost(){\r\n");
      out.write("\t\tif($('#newPost').val().length>0){\r\n");
      out.write("\t\tvar fromData = $('#post_form').serializeArray();\r\n");
      out.write("\t\tvar dataObj = {};\r\n");
      out.write("\t\tfor(var i=0;i < fromData.length;i++){\r\n");
      out.write("\t\t\tvar var2  = fromData[i].value;\r\n");
      out.write("\t\t    dataObj[fromData[i].name] = var2;\r\n");
      out.write("\t\t   }    \r\n");
      out.write("\t\tvar json = JSON.stringify(dataObj);\r\n");
      out.write("\t//\talert(json);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\t headers: { \r\n");
      out.write("\t\t\t        'Accept': 'application/json',\r\n");
      out.write("\t\t\t        'Content-Type': 'application/json' \r\n");
      out.write("\t\t\t    },\r\n");
      out.write("        dataType : \"json\",\r\n");
      out.write("        type: \"POST\",\r\n");
      out.write("        url: \"/SE-project-team-six/homePage/doPost\",\r\n");
      out.write("        data: json,\r\n");
      out.write("        error: function(xhr,err){\r\n");
      out.write("            alert(\"readyState: \"+xhr.readyState+\"\\nstatus: \"+xhr.status);\r\n");
      out.write("            alert(\"responseText: \"+xhr.responseText+\" \"+err);\r\n");
      out.write("     \t    console.log(xhr.responseText);\r\n");
      out.write("        },\r\n");
      out.write("        success: function(response){\r\n");
      out.write("     //   alert(response.key);\r\n");
      out.write("        //window.location.href = response.key;\r\n");
      out.write("        $('#newPost').val('');\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        });\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\tprompt(\"your textbox is empty!\");\r\n");
      out.write("\t\t}\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
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
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"/SE-project-team-six/profilePage\">Home Page</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"/SE-project-team-six/myProfilePage\">Profile Page</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"/SE-project-team-six/searchPage\">Search Friend</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t</div><!-- /.navbar-collapse -->\r\n");
      out.write("\t\t</div><!-- /.container-fluid -->\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\t\t\r\n");
      out.write(" \t <div class=\"container\" style=\"padding-left:25px;\">  \t\r\n");
      out.write("\t\t\t<a href=\"othersBackgroundPicture\"><img src=\"data:image/jpeg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${otherProfilePage.backgroundPicture}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"position:absolute;\r\n");
      out.write("\t\tleft:200px;\r\n");
      out.write("\t\ttop:50px;\r\n");
      out.write("\t\tz-index:0;\r\n");
      out.write("\t\tborder: 2px solid grey;\" width=75% height=350px   alt=\"[]\" ></a>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    <a href=\"othersProfilePicture\"><img src=\"data:image/jpeg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${otherProfilePage.profilePicture}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"position:relative;\r\n");
      out.write("\t\tleft:30px;\r\n");
      out.write("\t\ttop:30px;\r\n");
      out.write("\t\tz-index:1;border: 2px solid grey;\" width=250px height=250px alt=\"[]\" /></a>\r\n");
      out.write("\t\t<h2 style=\"position:relative;\r\n");
      out.write("\t\tleft:30px;\r\n");
      out.write("\t\ttop: 20px;\r\n");
      out.write("\t\tz-index:1; color: white;\">\r\n");
      out.write("       \t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${otherProfilePage.fullName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("    \t</h2>\r\n");
      out.write("\t\t<div class=\"container-fluid\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-9\" style=\"padding:15px 15px 15px 15px;\" align= right>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"updateInfo\"> <button type=\"button\" style=\"width:100px\" name=\"Edit\" value=\"Edit\" id=\"Edit\" class=\"btn btn-primary\" disabled> Edit </button> </a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container\" style=\"position:relative;padding-top: 50px;\" >\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"container-fluid\" >\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\" style=\"padding:15px 15px 15px 15px; position:center;\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" style=\"width:250px\" name=\"basic\" value=\"basic\" id=\"basic\" class=\"btn btn-primary\" onclick=\"doBasic()\"> Basic Information </button>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" style=\"width:250px\" name=\"contact\" value=\"contact\" id=\"contact\" class=\"btn btn-primary\" onclick=\"doContact()\"> Contact </button>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" style=\"width:250px\" name=\"post\" value=\"post\" id=\"post\" class=\"btn btn-primary\" onclick=\"doOldPost()\"> Old Post </button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"information\" style=\"padding-top:50px\">\r\n");
      out.write("\t\t<div id=\"oldPosts\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div id=\"contactInfo\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group-lg col-lg-9\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-12\" >\r\n");
      out.write("\t\t\t\t\t<label for=\"emailId\">Phone</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"something\" readonly=\"readonly\" class=\"form-control\" id=\"something\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${otherProfilePage.phoneNumber}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-12\" >\r\n");
      out.write("\t\t\t\t\t<label for=\"emailId\">Email</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"something\" readonly=\"readonly\" class=\"form-control\" id=\"something\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${otherProfilePage.emailId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-12\" >\r\n");
      out.write("\t\t\t\t\t<label for=\"emailId\">Address</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"something\" readonly=\"readonly\" class=\"form-control\" id=\"something\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${otherProfilePage.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"basicInfo\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-group-lg col-lg-9\">\r\n");
      out.write("\t\t<div class=\"form-group col-lg-12\" >\r\n");
      out.write("\t\t\t\t\t<label for=\"emailId\">Gender</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"something\" readonly=\"readonly\" class=\"form-control\" id=\"something\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${otherProfilePage.gender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-group col-lg-12\" >\r\n");
      out.write("\t\t\t\t\t<label for=\"emailId\">Date Of Birth</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"something\" readonly=\"readonly\" class=\"form-control\" id=\"something\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${otherProfilePage.dob}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t<div class=\"form-group col-lg-12\" >\r\n");
      out.write("\t\t\t\t\t<label for=\"emailId\">School</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"something\" readonly=\"readonly\" class=\"form-control\" id=\"something\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${otherProfilePage.school}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/otherProfilePage.jsp(208,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/otherProfilePage.jsp(208,4) '${OtherUserPost}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${OtherUserPost}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/otherProfilePage.jsp(208,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("post");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<div id=\"left\" class=\"row col-lg-12\">\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t\t<div class=\"form-group col-lg-3\">\r\n");
          out.write("\t\t\t\t\t<div style=\"width:100%;height:100%;\">\r\n");
          out.write("    \t\t\t\t\t<a href=\"");
          if (_jspx_meth_c_005furl_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\" >\t</a>\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("    \t\t\t\t\t\t<img src=\"data:image/jpeg;base64,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.imagePostedBy}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"  id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" style=\"padding-left:15px;padding-top:20px;padding-right:05px;position:relative;z-index:11\" width=\"100%\"  onclick=\"change();\" height=\"100%\" alt=\"[]\" />\r\n");
          out.write("    \t\t\t\t\t\r\n");
          out.write("    \t\t\t\t</div>\r\n");
          out.write("    \t\t\t</div>\r\n");
          out.write("\t\t\t\t<div class=\"form-group col-lg-6\">\t\r\n");
          out.write("\t\t\t\t\t\t\t<label for=\"PostBy\" style=\"margin-top: 15%;font-size: 20px\">Posted By ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.fullName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("  </label>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t<div class=\"form-group col-lg-12\" >\r\n");
          out.write("\t\t\t\t\t<input type=\"text\" name=\"postDiasbled\" class=\"form-control\" id=\"postDiasbled\"  readonly=\"readonly\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post.newPost}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/otherProfilePage.jsp(214,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/SE-project-team-six/viewPic/${post.imagePostedBy}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/otherProfilePage.jsp(228,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/otherProfilePage.jsp(228,4) '${post.postPicString}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${post.postPicString}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/otherProfilePage.jsp(228,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("pics");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class=\"form-group col-lg-6\" style=\"width:100%;height:100%;\">\r\n");
          out.write("\t\t\t\t\t<a onclick=\"return goToURL();\">to my link</a>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"");
          if (_jspx_meth_c_005furl_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\" >\t</a>\r\n");
          out.write("\t\t\t\t\t\t\t<img src=\"data:image/jpeg;base64,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pics}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" style=\"padding-left:15px;padding-top:20px;padding-right:05px;position:relative;\" onclick=\"change()\" width=\"100%\"  height=\"100%\" alt=\"[]\" />\r\n");
          out.write("    \t\t\t\t\r\n");
          out.write("    \t\t\t\t</div>\r\n");
          out.write("    \t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/views/otherProfilePage.jsp(231,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/SE-project-team-six/viewPic/${pics}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }
}