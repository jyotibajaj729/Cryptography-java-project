package C;
import java.util.Scanner;
public class user {
	    public String username;
	    public String password;
	    int x=0;
	    void login()
	    { 
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("************************************");
			System.out.println("*                                  *");
			System.out.println("*              LOG IN              *");
			System.out.println("*                                  *");
			System.out.println("************************************");
		    System.out.println("username: ");
		    username = input.next();
		    System.out.println("password: ");
		    password = input.next();
		    if(username.equals("user") && password.equals("pass")) 
		    {
		        System.out.println("You are logged in.");
	        }
		    else if(!username.equals("user") || !password.equals("pass"))
		    {
		    	System.out.println("Incorrect username or password.");
		    	x+=1;
               if(x==3)
             {
        	   System.out.println("You have entered Incorrect username or password 3 times.");
        	   System.out.println("Please try after a while.");
        	   System.exit(0);
             }
             else if(x<3)
             {
            	   System.out.println("Log in Again.");
   		    	   login();
             }
	    }
	    }
}
	