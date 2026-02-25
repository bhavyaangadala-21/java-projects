package Mypackage;
import java.util.Scanner;
public class Recursion_sumofnumbers {

		 public static int sum(int n) {
	         if (n == 0) return 0; // base case
	         else return n + sum(n - 1); // recursive call
	     }

	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         System.out.print("Enter n: ");
	         int n = sc.nextInt();
	         int result = sum(n);
	         System.out.println("Sum of first " + n + " numbers is: " + result);
	     sc.close();
	}

}