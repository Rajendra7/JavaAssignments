import java.util.Scanner;


public class LoginApplication {
	static String userId=null;
	static String password=null;
	static final String USER_ID="Rajendra"; 
	static final String PASS="Raj@123"; 
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
    		for(int i=1; i<=3; i++){//Checking for three times
				System.out.print("Ënter User-Id: ");
	    		userId = scanner.nextLine();// gets inputs from user
	    		System.out.print("Ënter Password: ");
	   		    password = scanner.nextLine();
	   		    if(userId.equals(USER_ID) && password.equals(PASS)){// checking for valid user
	   		    	System.out.println("Welcome "+userId);
	   		    	break;//if login credential is correct then exit
	   		    }else{
	   		    	System.out.println("You have entered wrong user-id or password.");
	   		    }
    		}
    		if(!userId.equals("Rajendra") && !password.equals("Raj@123")) 
    	    	System.out.print("Please Contact Admin.");
    	    }
	}

}