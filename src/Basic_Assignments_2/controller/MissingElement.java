
public class MissingElement 
{
	public int MissingElement (int array[])
	{
		int length=array.length;
		for(int i=0;i<length;i++)
		{
			if(array[i]!=(i+1))
			{
				return (i+1);
			}
		}
		return length+1;
		
	}
	

}
