package Mypackage;

import java.util.Scanner;

public class Palindrome_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        boolean palin = true;

        for(int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if(str.charAt(i) != str.charAt(j)) {
                palin = false;
                break;
            }
        }

        if(palin)
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");

        sc.close();
    }
}