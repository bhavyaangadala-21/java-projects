package Mypackage;
import java.util.Scanner;
public class Evensum {
	public static int Evensum(int n,int x) {
		if(x>n)
			return x;
		else
			return x + even sum(n,x+2)
	}
    public static void main(String[]args) {
    	Scanner sc =new Scanner (System.in);
    	int x = sc.nextInt();
    	int n = sc.nextInt();
    	System.out.print("Sum of Even numbers:" +Evensum(n,x));
    	
    }
}
