import java.util.Scanner;
class Calculator
{
	public static void main(String[] arg)
	{
	float a,b,c,d,e,f;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextFloat();
	System.out.println("Enter second number");
	b=sc.nextFloat();
	c=addition(a,b);
	d=subtraction(a,b);
	e=multiplication(a,b);
	f=divison(a,b);
	System.out.println("Addition is"+c);
	System.out.println("Subtraction is"+d);
	System.out.println("Multiplication is"+e);
	System.out.println("Divison is"+f);
	}
	static float addition(float x,float y)
	{
	return x+y;
	}
	static float subtraction(float x,float y)
	{
	return x-y;
	}
	static float multiplication(float x,float y)
	{
	return x*y;
	}
	static float divison(float x,float y)
	{
	return x/y;
	}
}