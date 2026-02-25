package Mypackage;

import java.util.Scanner;
public class GradeMethod {

	public static String grade(int marks) {
	    if(marks<=100 && marks>80)
	      return "A";
	    else if(marks<=80 && marks>70)
	      return "B";
	    else if(marks<=70 && marks>50)
	      return "C";
	    else 
	      return "Fail";
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int marks=sc.nextInt();
	    String res = grade(marks);
	    System.out.println("res" +res);
	    sc.close();
	}

}
