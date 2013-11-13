package quizsite;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiChoiceTest {
	private String question = "Where is Stanford?";
	private String answer = "CA";
	private String A = "Mexico";
	private String B = "In my pants";
	private MultiChoice test;

	@Test
	public void testMultiChoice() {
		test = new MultiChoice(question, answer);
		test.addAnswer("Bay Area, CA");
	}

	@Test
	public void testAddMCOption() {
		test.addMCOption(B);
		test.addMCOption(A);
		assertEquals(2, test.getMCOptions().size());
	}

	@Test
	public void testGetMCOptions() {
		String[] check = {B, A};
		assertEquals(check, test.getMCOptions());
	}

	@Test
	public void testGetAllPossAnswers() {
		String[] check = {answer, "Bay Area, CA"};
		assertEquals(check, test.getAllPossAnswers());
	}

}
