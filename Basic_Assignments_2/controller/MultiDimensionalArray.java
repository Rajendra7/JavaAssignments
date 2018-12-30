public class MultiDimensionalArray {

	public boolean isNumberInArray(int[][] arrayOfInteger, int number) {
		 if(checkNumberInArray(arrayOfInteger,number).equals("")){
			 return false;
         }else{
        	 return true;
         }
	}
	
	private String checkNumberInArray(int[][] arrayOfInteger, int number) {
		String returnValue="";
		for(int i=0;i<arrayOfInteger.length;i++){   
			for(int j=0; j<arrayOfInteger[i].length; j++){
				if(arrayOfInteger[i][j] == number){//finding for location of input value
					returnValue=i+","+j;
	            	//System.out.println("index "+s);
	            } 
			}
        }
		//System.out.println(s);
		return returnValue;	//return index of given number
	}
	
}