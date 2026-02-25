package Mypackage;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrgam_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int l1 = str1.length();
		int l2 = str2.length();
		if(l1!=l2)
		{
			System.out.println("Not Anagrams");
			return;
		}
		char[] a1 = str1.toCharArray();
		char[] a2 = str2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
        if(Arrays.equals(a1 , a2))
        	System.out.println("Anagram");
		 
	}
   
}
