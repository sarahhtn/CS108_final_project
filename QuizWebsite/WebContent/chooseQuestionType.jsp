<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.*, quizsite.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Question Type</title>
</head>
<h1> Choose the question type </h1>
<body>

<%
Quiz quiz = request.getParameter("quiz");
%>

<form action="optionsQuiz.jsp" method = "post">
<p> <input type="submit" value = "Question-Response" /> </p>
<input name="quiz" type="hidden" value= <%= quiz %>/> 
</form>

<form action="optionsQuiz.jsp" method = "post">
<p> <input type="submit" value = "Fill In the Blank" /> </p>
<input name="quiz" type="hidden" value=<%= quiz %>/> 
</form>

<form action="optionsQuiz.jsp" method = "post">
<p> <input type="submit" value = "Multiple Choice" /> </p>
<input name="quiz" type="hidden" value=<%= quiz %>/> 
</form>

<form action="optionsQuiz.jsp" method = "post">
<p> <input type="submit" value = "Picture-Response Questions" /> </p>
<input name="quiz" type="hidden" value=<%= quiz %>/> 
</form>

</body>
</html>