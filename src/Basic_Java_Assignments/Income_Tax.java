import java.util.Scanner;
class Income_tax 
{
	public static void main(String[] args)
	{
	double tax;
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter the income:");
	double income=s.nextDouble();
	if(income<180000)
	{
	tax=0;
	System.out.println("THe person comes under slab A " +tax);
	} else if(income>181001 && income<300000)
	{
	tax= income*0.1;
	System.out.println("THe person comes under slab B " +tax);
	} else if(income>300001 && income<500000)
	{
	tax=income*0.2;
	System.out.println("THe person comes under slab C " +tax);
	} else if(income>500001 && income<1000000)
	{
	tax=income*0.3;
	System.out.println("THe person comes under slab D " +tax);
	}	
	}
}
	
