package quizsite;

import static org.junit.Assert.*;

import org.junit.Test;

public class FillInTest {
	private String question = "My name is %_.";
	private String answer = "Bob";
	private FillIn test;

	@Test
	public void testFillIn() {
		test = new FillIn(question, answer);
	}

	@Test
	public void testCheckAnswer() {
		assertEquals("Bob", test.getAnswer());
	}

	@Test
	public void testGetQuestion() {
		assertEquals("My name is ___[BLANK]___.", test.getQuestion());
	}

}
