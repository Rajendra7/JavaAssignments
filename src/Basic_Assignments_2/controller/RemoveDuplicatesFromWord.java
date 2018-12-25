public class RemoveDuplicatesFromWord {
	
	public String removeDuplicates(String word) {
		String wordWithoutDuplicate="";
			for(int i=0; i<word.length(); i++){
				if(!wordWithoutDuplicate.contains(String.valueOf(word.charAt(i)))){
					wordWithoutDuplicate=wordWithoutDuplicate.concat(String.valueOf(word.charAt(i)));
				}
			}
		return wordWithoutDuplicate;
	}

}