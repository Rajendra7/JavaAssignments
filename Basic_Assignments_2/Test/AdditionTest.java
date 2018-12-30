import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//creating class
public class AdditionTest {
	private Calculator calculator;
	
	@Before  //using Before Annotation
	public void setup(){
		calculator=new Calculator();
	}

	@Test    //using Test Annotation
	public void TwoPositiveNumbers()
	{
		int answer=calculator.Calculator(25,25);
		assertEquals(50,answer);
		
	}
	@Test
	public void TwoNegativeNumbers()
	{
		int answer=calculator.Calculator(-25,-25);
		assertEquals(-50,answer);
		
	}
	@Test
	public void OneNegativeNumber()
	{
		int answer=calculator.Calculator(-25,25);
		assertEquals(0,answer);
		
	}
	@Test
	public void OneZeroAndOnePositiveNumber()
	{
		int answer=calculator.Calculator(0,25);
		assertEquals(25,answer);
		
	}
	@Test
	public void OneZeroAndOneNegativeNumber()
	{
		int answer=calculator.Calculator(0,-25);
		assertEquals(-25,answer);
		
	}

}
