package quizsite;

import java.util.ArrayList;

public class Question {
	private String question;
	private String answer;
	private ArrayList<String> answers;
	
	Question(String question, String answer){
		this.question = question;
		this.answer = answer;
		answers = new ArrayList<String>();
		answers.add(answer);
	}
	
	public boolean checkAnswer(String answer) {
		for(int i=0; i<answers.size(); i++){
			if(this.answer.equals(answer)) return true;
		}
		return false;
	}
	
	public void resetQuestion(String question){
		this.question = question;
	}
	
	public void addAnswer(String answ){
		answers.add(answ);
	}
	
	public String getQuestion(){
		return question;
	}
	
	public ArrayList<String> getAllPossAnswers(){
		return answers;
	}
	
	public String getAnswer(){
		return answer;
	}
}
