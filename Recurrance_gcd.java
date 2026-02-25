package Mypackage;

public class Recurrance_gcd {

	public static int gcd (int a , int b) {
	    if(b/a==0)
	      return b;
	    else
	      return gcd (b, a%b);
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    System.out.println("enter the values of a and b:");
	    System.out.println("gcd of ("+a+", "+b+")is "+gcd(a,b));
	    sc.close();
		
		
	}

}
