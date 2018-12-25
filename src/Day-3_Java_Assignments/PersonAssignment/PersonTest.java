import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {
	private Person person,person1;
	@Before
	public void setUp(){
		person = new Person("Ajay",04,07,1995);
		person1 = new Person("Navya",29,12,1997);
	}

	
	@Test
	public void test1() {
		String expected="Ajay is older than Navya by 2 years ,5 months, and 25days";
		String result =person1.olderOne(person,person1);
		assertEquals(expected,result);
	}
}