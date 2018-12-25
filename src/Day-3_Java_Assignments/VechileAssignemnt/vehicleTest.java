import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class vehicleTest {
	private Vehicle vehicle;
	
	@Before
	public void setup()
	{
		vehicle=new Vehicle(100,"left","Raj");
	}

	@Test
	public void testForSpeed() {
		int result=vehicle.changeSpeed(100);
		assertEquals(100,result);
	}
	@Test
	public void testForDirecrtion() {
		int result=vehicle.direction(90,"NorthEast");
		assertEquals("NorthEast",result);
	}

}
