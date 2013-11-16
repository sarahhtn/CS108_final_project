<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creating Quiz</title>
</head>
<body>
<form action="chooseQuestionType.jsp" method = "post">

<h1> Create your quiz! </h1>

<h2> Enter your overall description of the purpose of this quiz: </h2>
<input type="text" name = "quizdescription">

<!--

<h2> Creating questions for the quiz </h2>
<p> Place next to the corresponding textbox how many of each type of question you would like in your quiz </p>
<p> Question-Response: <input type="text" name = "question_response"> </p>
<p> Fill in the Blank: <input type="text" name = "fill_in_blank"> </p>
<p> Multiple Choice: <input type="text" name = "multiple_choice"> </p>
<p> Picture- Response Questions: <input type="text" name = "picture_response"> </p>

-->

<p> Click next to create your questions for this quiz <input type="submit" value = "Next" /></p>
</form>

</body>
</html>