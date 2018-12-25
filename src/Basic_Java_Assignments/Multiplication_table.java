import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number:");
		n= s.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i)+"-----"+(n*i)*(n*i));
			s.close();	
		}

	}

}
