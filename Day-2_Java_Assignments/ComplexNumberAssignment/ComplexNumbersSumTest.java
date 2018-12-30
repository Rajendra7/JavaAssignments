import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ComplexNumbersSumTest {
	private Complex complex1,complex2,complex3;
	
	@Before
	public void setup(){
	complex1=new Complex();
	complex2=new Complex();
	complex3=new Complex();
	}
	@Test
	public void mainForPositiveReal() {
		complex1.ComplexNumberSum(5,4.5);
		complex2.ComplexNumberSum(5,4.5);
		complex3=complex1.sum(complex2);
	}

}
