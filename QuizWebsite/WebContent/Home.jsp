<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="quizsite.User, quizsite.Mail, java.util.*, java.sql.ResultSet, java.text.*"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
User currUser = (User) session.getAttribute("user");
ArrayList<Mail> mails = currUser.getMails();
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/QuizWebsite/Home.css" type="text/css">
<title>Home</title>
</head>

<body>
<h3>Hello, <%= request.getParameter("name") %>! Welcome to our quiz website!</h3>

<div class="msg">
<p class="block_title">Mails Received</p>
<ul>
<%
for(Mail m : mails) {
	out.println("<li>From userId " + m.getFromId() + ", type is " + m.getType() + ", with content: " + m.getContent() + "</li>");
}
%>
</ul>
</div>

<div class="lists">
<div class="pop_quiz list_block">
<p class="block_title">Pop Quizzes</p>
</div>
<div class="recent_created_quiz list_block">
<p class="block_title">Recently Created Quizzes</p>
</div>
<div class="taken_quiz_activity list_block">
<p class="block_title">Recently Quizzes Taken</p>
</div>
<div class="recent_self_created_quiz list_block">
<p class="block_title">Quizzes Created by You</p>
</div>
</div>

<div class="friends_activity">
<p class="block_title">Friends Activities</p>
</div>

<form action="FriendServlet" method="post">
<input type="submit" value="Create Friend"/>
</form>

<form action="MailServlet" method="post">
<input type="submit" value="Create Mail"/>
</form>

</body>
</html>