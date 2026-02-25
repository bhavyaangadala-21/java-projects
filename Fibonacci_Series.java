package Mypackage;
import java.util.Scanner;
public class Fibonacci_Series {
	public static int fib (int n) {
	    if(n<=1)
	      return n;
	    else
	      return fib(n-1)+fib(n-2);
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    System.out.println("fibonacci series is :");
	    for(int i=1;i<=n;i++)
	      System.out.println(fib(i)+ " ");
	    sc.close();

	  }

	}