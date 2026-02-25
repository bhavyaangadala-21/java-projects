package Mypackage;

import java.util.Scanner;
public class Multiply {
	  public static int multiply(int a, int b, int c) {
	    int product=1;
	    product=a*b*c;
	    return product;
	  }

	  public static void main(String[] args) {
	    Scanner SC=new Scanner(System.in);
	    System.out.println("Enter 3 numbers: ");
	    int a=SC.nextInt();
	    int b=SC.nextInt();
	    int c=SC.nextInt();
	    int res=multiply(a,b,c);
	    System.out.println("product of numbers = "+res);
           
	    SC.close();
	  }
		
	}
	
	


