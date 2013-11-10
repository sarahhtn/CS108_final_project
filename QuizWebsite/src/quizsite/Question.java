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
		return this.answer.equals(answer);
	}
	
	public void addAnswer(String answ){
		answers.add(answ);
	}
	
	public String getQuestion(){
		return question;
	}
}
