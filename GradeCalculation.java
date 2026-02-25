package Mypackage;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
	    System.out.println("Enter the marks");
	    int marks=SC.nextInt();
	    if (marks>=90)
	      System.out.println("Grade A");
	    else if(marks<=89 && marks>=80)
	      System.out.println("Grade B");
	    else if(marks<=79 && marks>=70)
	      System.out.println("Grade C");
	    else if(marks<=69 && marks>=60)
	      System.out.println("Grade D");
	    else 
	      System.out.println("Fail");
	    SC.close();

	}

}
