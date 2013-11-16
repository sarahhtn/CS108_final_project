<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create questions</title>
</head>
<body>
<form action="finishCreationQuiz.jsp" method="post">

<%
	HttpSession a = request.getSession();
	Quiz x = (Quiz) a.getAttribute("quiz");
	
%>





<p> <input type = "submit"  value = "Next: Choose your quiz options!"  /> </p>
</form>


</body>
</html>