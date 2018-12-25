import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MissingElementTest {
	private MissingElement missing;
	@Before
	public void setup()
	{
		missing=new MissingElement();
	}

	@Test
	public void FindingMissingElement() 
	{
		int array[]={1,2,4,5,6};
		
		int answer=missing.MissingElement(array);
		assertEquals(3,answer);
	}

}
