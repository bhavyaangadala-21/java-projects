package Mypackage;

import java.util.Scanner;

public class Reversearray {
	public static void ReverseArray(int a[]) {
	    for(int i=0,j=a.length-1;i<j;i++,j--) {
	      int temp=a[i];
	      a[i]=a[j];
	      a[j]=temp;
	    }
	  }
	  public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    int [] a=new int[size];
	    for(int i=0;i<a.length;i++){
	      a[i]=sc.nextInt();
	      
	    }
	    System.out.println("Array before Reverse: ");
	    for(int i=0;i<a.length;i++) {
	      System.out.print(a[i]+" ");
	    }
	    ReverseArray(a);
	    System.out.println("Array After Reversing");
	    for(int i=0;i<a.length;i++) {
	      System.out.print(a[i]+"");
	    }
	  }
}