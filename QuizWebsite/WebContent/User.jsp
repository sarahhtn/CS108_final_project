<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/QuizWebsite/Home.css" type="text/css">
<title>User Page</title>
</head>
<body>

<p>Username: </p>

<form action="MailServlet" method="post">
<input type="submit" name="addFriend" value="Add as Friend"/>
</form>

<form action="MailServlet" method="post">
<input type="submit" name="sendChallenge" value="Send Challenge"/>
</form>

<form action="MailServlet" method="post">
<input type="submit" name="note" value="Send Note"/>
</form>

</body>
</html>