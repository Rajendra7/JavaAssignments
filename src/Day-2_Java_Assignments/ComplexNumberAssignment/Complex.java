
/*A complex number consists of a real and imaginary part. We will create a class which stores this data (the fields of the class).
Immutable: We will follow a convention that our complex numbers will be immutable. That is, once a complex number is created it can't be changed. 
This is good for calculations for instance. 
It is nice to guarantee that a number won't change in the midst of a calculation. 
The first step in realizing this is to insert the word "final" between "public" and "class" in the class definition.
We will store the real and imaginary parts as a doubles. To do this we add a line to the Complex class in Complex.java.
*/

public class Complex{
	private double real;
	private double imaginary;
	public void ComplexNumberSum(double real, double imaginary) {
	
		this.real = real;
		this.imaginary = imaginary;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImaginary() {
		return imaginary;
	}
	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	public void disp()
	{
		System.out.println(real + "," +imaginary);
	}
	private double newReal;
	private double newImaginary;
	
	Complex  sum(Complex  complex)
	{
		Complex newComplex=new Complex();
		newReal=this.real+complex.real;
		newImaginary=this.imaginary+complex.imaginary;
		newComplex.setReal(newReal);
		newComplex.setImaginary(newImaginary);
		return newComplex;
		
		
	}

}
