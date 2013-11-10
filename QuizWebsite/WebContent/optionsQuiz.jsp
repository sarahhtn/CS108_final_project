<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Options </title>
</head>


<form action="finishCreationQuiz.jsp" method="post">

<body>


<script type="text/javascript">
function validate(){
	console.log("here");
	if(document.getElementById('yesrandomquestions').checked){
		alert("hi");
	}
	else if(document.getElementById('norandomquestions').checked){
			
		}
	else if((document.getElementById('yesimmediate').checked)){
			
		}
	else if (document.getElementById('noimmediate').checked){
			
		}
	}
	
</script>


<h1> Choose options for your quiz</h1>

<h2> Random Questions? </h2>

<p> If you choose yes, the questions will be presented in random order </p>
<p> If you choose no, the questions will always be presented in the same order </p>


Yes <input type="checkbox" name = "yesrandomquestions" onclick = "validate">
No <input type="checkbox" name = "norandomquestions" onclick = "validate">


<h2> Choose how many pages to display questions</h2>
<p> If you choose one page, all the questions will be displayed on a single webpage and there will be one submit button</p>
<p> If you choose multiple pages, the quiz will display a single question and allow the user to submit the answer
	and then display the next question</p>
<select name = "pagenumbers">
  <option value="1"> One page</option>
  <option value="2"> Multiple pages</option>
</select>

<h2> Immediate Correction? (only for multiple page quizzes)</h2>
<p> If you choose yes, the user will receive immediate feedback on an answer.</p>
<p> If you choose no, the quiz will only be graded once all the questions have been sen and responded to. </p>

Yes <input type="checkbox" name = "yesimmediate" onclick = validate>
No <input type="checkbox" name = "noimmediate" onclick = validate>

<p> <input type = "submit"  value = "Finish creating quiz!"  /> </p>

</form>

</body>
</html>
