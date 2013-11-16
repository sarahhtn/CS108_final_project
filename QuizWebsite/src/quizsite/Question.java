package quizsite;

import java.util.ArrayList;

public class Question {
	private String question;
	private String answer;
	private ArrayList<String> answers;
	public final String DELIM = "\n";
	
	Question(String question, String answer){
		this.question = question;
//		System.out.println("question: " + this.question);
		this.answer = answer;
//		System.out.println("answer: " + this.answer);
		answers = new ArrayList<String>();
		parseAnswers();
	}
	
	public boolean checkAnswer(String answer) {
		for(int i=0; i<answers.size(); i++){
			if(this.answer.equals(answer)) return true;
		}
		return false;
	}
	
	public void resetQuestion(String question){
		this.question = question;
//		System.out.println("reset question to: " + this.question);
	}
	
	private void parseAnswers(){
		String[] parsedAnswers = answer.split(DELIM);
		for(int i=0; i<parsedAnswers.length; i++){
			answers.add(parsedAnswers[i]);
		}
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
