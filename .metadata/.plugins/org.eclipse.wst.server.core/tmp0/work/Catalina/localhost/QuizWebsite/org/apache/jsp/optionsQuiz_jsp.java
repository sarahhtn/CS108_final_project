/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2013-11-17 00:44:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import quizsite.*;

public final class optionsQuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title> Quiz Options </title>\n");
      out.write("</head>\n");
      out.write("<form action=\"finishCreationQuiz.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("<body>\n");

Quiz quiz = (Quiz) session.getAttribute("newQuiz");

      out.write("\n");
      out.write("\n");
      out.write("<h1> Choose options for your quiz</h1>\n");
      out.write("\n");
      out.write("<h2> Random Questions? </h2>\n");
      out.write("\n");
      out.write("<p> If you choose yes, the questions will be presented in random order </p>\n");
      out.write("<p> If you choose no, the questions will always be presented in the same order </p>\n");
      out.write("\n");
      out.write("<select name = \"randomQuestions\">\n");
      out.write("  <option value=\"1\"> Yes </option>\n");
      out.write("  <option value=\"2\"> No </option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<h2> Choose how many pages to display questions</h2>\n");
      out.write("<p> If you choose one page, all the questions will be displayed on a single webpage and there will be one submit button</p>\n");
      out.write("<p> If you choose multiple pages, the quiz will display a single question and allow the user to submit the answer\n");
      out.write("\tand then display the next question</p>\n");
      out.write("<select name = \"pagenumbers\">\n");
      out.write("  <option value=\"1\"> One page</option>\n");
      out.write("  <option value=\"2\"> Multiple pages</option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<h2> Immediate Correction? (only for multiple page quizzes)</h2>\n");
      out.write("<p> If you choose yes, the user will receive immediate feedback on an answer.</p>\n");
      out.write("<p> If you choose no, the quiz will only be graded once all the questions have been seen and responded to. </p>\n");
      out.write("\n");
      out.write("<select name = \"immediateCorrection\">\n");
      out.write("  <option value=\"1\"> Yes </option>\n");
      out.write("  <option value=\"2\"> No </option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<p> <input type = \"submit\"  value = \"Finish creating quiz!\"  /> </p>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
