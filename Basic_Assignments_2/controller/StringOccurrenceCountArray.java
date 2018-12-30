public class StringOccurrenceCountArray {

	public int countOfOccurance(String[] stringOfNames, String inputName) {
		int count=0;
		for(String name:stringOfNames){
			if(name==inputName){
				count++;
			}
		}
		return count;
	}

}