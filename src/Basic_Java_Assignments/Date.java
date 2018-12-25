import java.util.Scanner;
public class Date {
	
		public static void main(String[] args)
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the date:");
		int date=s.nextInt();
		System.out.println("Please enter the month:");
		int month=s.nextInt();
		System.out.println("Please enter the year:");
		int year=s.nextInt();
		s.close();
		if(month==1 && date<=31)
		{
			System.out.println(date+"/"+"january"+"/"+year);
		}
		else if(month==2 && date<=29)
		{
			System.out.println(date+"/"+"febrauary"+"/"+year);
		}
		else if(month==3 && date<=31)
		{
			System.out.println(date+"/"+"march"+"/"+year);
		}
		else if(month==4 && date<=30)
		{
			System.out.println(date+"/"+"April"+"/"+year);
		}
		else if(month==5 && date<=31)
		{
			System.out.println(date+"/"+"may"+"/"+year);
		}
		else if(month==6 && date<=30)
		{
			System.out.println(date+"/"+"june"+"/"+year);
		}
		else if(month==7 && date<=31)
		{
			System.out.println(date+"/"+"july"+"/"+year);
		}
		else if(month==8 && date<=31)
		{
			System.out.println(date+"/"+"August"+"/"+year);
		}
		else if(month==9 && date<=30)
		{
			System.out.println(date+"/"+"Septmber"+"/"+year);
		}
		else if(month==10 && date<=31)
		{
			System.out.println(date+"/"+"October"+"/"+year);
		}
		else if(month==11 && date<=30 )
		{
			System.out.println(date+"/"+"November"+"/"+year);
		}
		else if(month==12 && date<=31)
		{
			System.out.println(date+"/"+"December"+"/"+year);
		}
		else System.out.println("The date is invalid");
		}
	}
					

