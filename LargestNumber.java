package Mypackage;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
	    System.out.print("Enter three values : \n");
	    int a=SC.nextInt();
	    int b=SC.nextInt();
	    int c=SC.nextInt();
	    
	    if (a>b && a>c)
	      System.out.println("a is largest");
	    else if (b>a && b>c)
	      System.out.println("b is largest");
	    else
	      System.out.println("c is largest");
	    sc.close();	

	}

}
