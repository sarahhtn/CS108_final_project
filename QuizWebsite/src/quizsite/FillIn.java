package quizsite;

public class FillIn extends Question{
	public final String DELIM = "%_" ;
	
	public FillIn(String question, String answer){
		super(question, answer);
		String FITB = "";
		int idx = question.indexOf(DELIM);
		FITB = question.substring(0, idx) + "__[BLANK]____" + question.substring(idx, question.length());
		resetQuestion(FITB);
	}
	
	

}
