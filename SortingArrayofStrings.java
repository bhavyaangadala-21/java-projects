package Mypackage;

import java.util.Scanner;

public class SortingArrayofStrings {

	public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
	  String str = sc.nextLine();
	  String[] arr = str.split(" ");
	  
	  for(int i = 0;i < arr.length - 1;i++) {
		  for(int j = 0;j < arr.length - i- 1;j++) {
			  if (arr[j].compareTo(arr[j+1])>0) {
				  String temp =arr[j];
				  arr[j] = arr[j+1];
				  arr[j+1] = temp;
				  
				  
			  }
		  }
		  System.out.println("Sorted strings:");
	        for (String s : arr) {
	            System.out.println(s);
	        }
	        sc.close();
	  }
	}
}