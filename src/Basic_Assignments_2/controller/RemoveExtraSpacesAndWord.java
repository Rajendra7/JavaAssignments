public class RemoveExtraSpacesAndWord {

	public String removeSpacesDuplicates(String sentence, int position, String word) {
		String spaceLessSentence=sentence.replaceAll("\\s+", " ");
		String wordWithoutDuplicate="";
		String []words=spaceLessSentence.split(" ");
		for(int i=0; i<words.length; i++){
			if(words[i].equals(word) && i==position){
			}else{
				if(i!=words.length-1){
					wordWithoutDuplicate=wordWithoutDuplicate.concat(words[i]+" ");
				}else{
					wordWithoutDuplicate=wordWithoutDuplicate.concat(words[i]);
				}
			}
		}
		return wordWithoutDuplicate;
	}

}