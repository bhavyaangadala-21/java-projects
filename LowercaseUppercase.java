package Mypackage;
 import java.util.Scanner;

public class LowercaseUppercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String str=sc.next();
		String str1=" ";

		for(int i=0;i<str.length();i++) {

			char ch=str.charAt(i);

			if(ch>='a' && ch <= 'z') { 

                ch = (char)(ch - 32);   

            }
			else {
				ch = (char)(ch+32);
			}
			str1+=ch;
		}

		System.out.println("in upper case:"+str1);

		sc.close();

	}

}