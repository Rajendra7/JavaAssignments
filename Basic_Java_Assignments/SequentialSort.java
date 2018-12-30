import java.util.*;
class SequentialSort
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int n,c,i,temp,a[];
	System.out.println("Enter number of elements:");
	n=s.nextInt();
	a=new int[n];
	System.out.println("Enter " + n + " integers");
	
	for(c=0;c<n;c++)
	a[c]=s.nextInt();
	
	for(c=0;c<n;c++)
	{
		for(i=c+1;i<n;i++)
		{
			if(a[c]>a[i])
			{
				temp=a[c];
				a[c]=a[i];
				a[i]=temp;
			}
		}
	}
	for(c=0;c<n;c++)
	{
		System.out.println(" "+a[c]);
	}
	}
}