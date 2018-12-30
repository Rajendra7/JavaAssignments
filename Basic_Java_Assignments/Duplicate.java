import java.util.*;
class Duplicate
{
	public static void main(String[] args)
	{
	int array_elements[]=new int[20];
	int initial_elements,next_elements;
	int i;
	Scanner s=new Scanner(System.in);
	System.out.print("enter array size:");
	int array_size=s.nextInt();
	
	for(i=0;i<array_size;i++)
	{
		System.out.println("Enter the elements:");
		array_elements[i]=s.nextInt();
	}
	System.out.println("Before:");
	for(i=0;i<array_size;i++)
	{
		System.out.println(array_elements[i]);
	}
	System.out.println("After:");
	for(initial_elements=0;initial_elements<array_size;initial_elements++);
	{
		for(next_elements=initial_elements+1;next_elements<array_size;)
		{
			if(array_elements[initial_elements]==array_elements[next_elements])
			{					

				for(int temp=next_elements;temp<array_size;temp++)
				{
					array_elements[temp]=array_elements[temp+1];
				}
				array_size=array_size-1;
			}
			else
				next_elements++;
		}
	}
	for(i=0;i<array_size;i++)	
		System.out.println(array_elements[i]);
	}
}
	