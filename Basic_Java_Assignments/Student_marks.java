import java.util.Scanner;

public class Student_marks {

	public static void main(String[] args) 
	{
		
		int marks[]= new int[3];
		int i;
		float total=0,average;
		Scanner s=new Scanner(System.in);
		for(i=0;i<3;i++)
		{
		System.out.println("Enter the marks of the students");
		marks[i]=s.nextInt();
		}
		s.close();
		
		if(marks[1] >60 && marks[2]>60 && marks[3]>60)
		
			System.out.println("passed");
		else
			System.out.println("Fail");

		if(marks[1]>60 && marks[2]>60 && marks[3]<60)
			System.out.println("Promoted");
		else
			System.out.println("Not Promoted");
		
		if(marks[1]>60 && marks[2]<60 && marks[3]<60)
			System.out.println("Fail");
		
	
	}	
}