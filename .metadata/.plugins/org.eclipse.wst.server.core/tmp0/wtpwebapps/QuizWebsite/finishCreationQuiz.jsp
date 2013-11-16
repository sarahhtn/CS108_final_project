<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Home.jsp" method = "post">

<%
HttpSession a = request.getSession();
Quiz x = (Quiz) a.getAttribute("quiz");

String randomQuestionsCheckBoxValue = request.getParameter("randomQuestions");
if(randomQuestionsCheckBoxValue.equals("Yes")){
	x.setDisplayRandomTrue();
}

String pageNumbers = request.getParameter("pagenumbers");
if(pageNumbers.equals("One")){
	x.setDisplayOnePageTrue();
}
else{
	x.setDisplayMultiplePagesTrue();
}

String immediateCorrectionCheckBoxValue = request.getParameter("immediateCorrection");
if(immediateCorrectionCheckBoxValue.equals("Yes")){
	x.setImmediateCorrectionTrue();
}
else{
	x.setFinalCorrectionTrue();
}

%>



<h1> Congratulations on creating your quiz! </h1>

<img src = "http://www.mucky-pups.co/wp-content/uploads/2013/05/9.jpg" alt = "happy dog">


<p> <input type="submit" value = "Return to Homepage" /></p>
</form>

</body>
</html>
