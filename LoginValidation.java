package Mypackage;
import java.util.Scanner;
public class LoginValidation {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
	    String User="section6";
	    String pass="Klh@123";
	    System.out.print("Enter username and password : \n");
	    String Uname=SC.nextLine();
	    String password=SC.nextLine();
	    if (User.equals(Uname) && pass.equals(password))
	      System.out.println("Login Successful");
	    
	    else 
	      System.out.println("login Failed");
	    SC.close();

	}

}
