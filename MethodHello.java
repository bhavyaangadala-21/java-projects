package Mypackage;
import java.util.Scanner;
public class MethodHello {
	static void greet() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {  
			greet();
		}
	}

}