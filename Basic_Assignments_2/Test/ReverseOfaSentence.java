import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseOfaSentence 
{
	private ReversingTheSentence SentenceReversing;
	
	@Before
	public void setup()
	{
		SentenceReversing = new ReversingTheSentence();
	}
	
	@Test
	public void ReverseTheWholeSentence() 
	{
		String answer = SentenceReversing.findReverseOfSentence("Let's take LeetCode contest");
		assertEquals("s'teL ekat edoCteeL tsetnoc",answer);
	}

}
