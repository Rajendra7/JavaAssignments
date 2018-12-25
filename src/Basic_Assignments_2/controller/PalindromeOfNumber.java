
public class PalindromeOfNumber {

	public int PalindromeOfNumber(int i) {
		// TODO Auto-generated method stub
		int remainder,reverse = 0;
		while(i!=0)
		{
			remainder=i%10;
			reverse=reverse*10+remainder;
			i=i/10;
		}
		return reverse;
	}

	

}
