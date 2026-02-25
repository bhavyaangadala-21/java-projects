package Mypackage;

import java.util.Scanner;

public class MethodDemo {
	static void greet1() {
		System.out.println("Good Morning");
	}
	static void greet2() {
		System.out.println("Good Afternoon");
	}
	static void greet3() {
		System.out.println("Good Evening");
	}
	static void greet4() {
		System.out.println("Good Night");
	}
	public static void main(String[] args) {
		greet4();
		greet3();
		greet2();
		greet1();
	}
}
