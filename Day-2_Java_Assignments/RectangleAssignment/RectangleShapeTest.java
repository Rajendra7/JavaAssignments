import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RectangleShapeTest {
	private RectangleShape rectangle;
	private RectangleShape rectangle1;
	
	@Before
	public void setup()
	{
	rectangle=new RectangleShape(2,3);
	rectangle1=new RectangleShape(5,3);
	}

	@Test
	public void AreaTest() {
		double answer=rectangle.getArea();
		assertEquals(6,answer,2);
	}

	@Test
	public void PerimeterTest() {
		double answer=rectangle.getPerimeter();
		assertEquals(10,answer,2);
	}
	@Test
	public void AreaComapratorTestWhenBothAreSame() {
		boolean flag = RectangleShape.areaComaparator(rectangle.getArea(), rectangle1.getArea());
		assertFalse(flag);
	}
	@Test
	public void AreaComapratorTestWhenBothAreDifferent() {
		boolean flag = RectangleShape.areaComaparator(rectangle.getArea(), rectangle1.getArea());
		System.out.print(""+flag);
		assertTrue(flag);
	}
}
