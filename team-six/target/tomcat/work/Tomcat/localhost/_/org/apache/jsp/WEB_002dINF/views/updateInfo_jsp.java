/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-04-27 23:16:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div><!-- /.navbar-collapse -->\r\n");
      out.write("\t\t</div><!-- /.container-fluid -->\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\" >\r\n");
      out.write("\t<div id=\"left\">\r\n");
      out.write("\t\t<form name=\"project_form\" id=\"project_form\" action=\"/SE-project-team-six/update\" enctype=\"multipart/form-data\" method=\"POST\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row col-lg-12\">\r\n");
      out.write("\t\t\t<h3 class=\"text-left\">Please complete your profile to proceed further </h3>\r\n");
      out.write("\t\t\t<hr size=\"10\" width=\"100%\" noshade style=\"color:#000000\" align=\"left\" />\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<h5 class=\"text-left\"><b>This section contains information provided on registration page which can be edited here </b></h5>\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-6\">\r\n");
      out.write("\t\t\t\t\t<label for=\"emailId\">Email</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"email\" name=\"emailId\" required class=\"form-control\" id=\"emailId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.emailId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-6\" >\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"password\">Password</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" required class=\"form-control\" id=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t   \t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-6\" >\r\n");
      out.write("\t\t\t\t\t<label for=\"dob\">Date of Birth</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"dob\" required class=\"form-control\" id=\"dob\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.dob}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t    <div class=\"form-group col-lg-6\" >\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"gender\">Gender</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"gender\" required class=\"form-control\" id=\"gender\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.gender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group col-lg-6\" >\r\n");
      out.write("\t\t\t\t\t<label for=\"securityQuestion1\">Your mother's maiden name ?</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"securityQuestion1\" required class=\"form-control\" id=\"securityQuestion1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.securityQuestion1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-6\" >\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"securityQuestion2\">Your father's maiden name ?</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"securityQuestion2\" required class=\"form-control\" id=\"securityQuestion2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.securityQuestion2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row col-lg-12\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t<hr size=\"10\" width=\"100%\" noshade style=\"color:#000000\" align=\"left\" />\r\n");
      out.write("\t\t<h5 class=\"text-left\"><b>This section requires few mandatory information required to join the Social Network </b></h5>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div class=\"form-group col-lg-6\" >\r\n");
      out.write("\t\t\t\t\t<label for=\"fullName\">Full Name</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"fullName\" class=\"form-control\" id=\"fullName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.fullName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"Enter Your Full Name\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t    <div class=\"form-group col-lg-6\" >\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"school\">School</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"school\" required class=\"form-control\" id=\"school\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.school}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"Enter Your School\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-6\" >\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"phoneNumber\">Phone number</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phoneNumber\" required class=\"form-control\" id=\"phoneNumber\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.phoneNumber}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"Enter Your Phone Number\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-6\" >\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label for=\"address\">Address number</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"address\" required class=\"form-control\" id=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserModel.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"Enter Your Address\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form-group col-lg-6\" >\r\n");
      out.write("\t\t\t\t    <label for=\"profilePic\">Upload Your Profile Picture</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"file\" name=\"profilePic\" required accept=\"image/*\" class=\"form-control\" id=\"profilePic\" >\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t       \r\n");
      out.write("\t\t       <div class=\"form-group col-lg-6\" >\r\n");
      out.write("\t\t\t\t    <label for=\"backgroundPic\">Upload Your Background Picture</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"file\" name=\"backgroundPic\" required accept=\"image/*\" class=\"form-control\" id=\"backgroundPic\" >\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t<div class=\"form-group row text-left col-lg-9\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\" name=\"save\" value=\"save\" id=\"save\" class=\"btn btn-primary\"> Save </button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("  <br style=\"clear:both;\"/>\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
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
}
