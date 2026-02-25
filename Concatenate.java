package Mypackage;

import java.util.Scanner;
public class Concatenate {
	  public static String concatenate(String s1,String s2 ){
	    String s3=s1+" "+s2;
	    return s3;
	  }
	  public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	    String res=concatenate(s1,s2);
	    System.out.println("Result = "+res);
	    sc.close();
	  }


	}

