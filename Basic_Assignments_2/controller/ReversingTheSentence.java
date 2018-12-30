public class ReversingTheSentence 
{
	public String findReverseOfSentence(String string)
	{
		char sentence[] = string.toCharArray();
		String string1 = "";
		for( int counter = 0 ; counter < sentence.length ; counter++ )
		{
			int find = counter ;
			while( counter < sentence.length && sentence[counter] != ' ' )
			{
				counter++;
			}
			int findOne = counter - 1;
			while( findOne >= find )
			{
				string1 = string1 + sentence[findOne];
				findOne--;
			}
			if(counter<sentence.length)
				string1=string1+sentence[counter];
		}
		return string1;
	}

}
