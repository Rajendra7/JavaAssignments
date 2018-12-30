import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PalindromeTest {
private PalindromeOfNumber palindrome;
	
	@Before
	public void setup(){
		palindrome=new PalindromeOfNumber();
	}

	@Test
	public void PalindromeOfPositiveNUmber() {
		int answer=palindrome.PalindromeOfNumber(121);
		assertEquals(121,answer);
		
	}
	@Test
	public void PalindromeOfNagativeNUmber() {
		int answer=palindrome.PalindromeOfNumber(-121);
		assertEquals(-121,answer);
		
	}

}
