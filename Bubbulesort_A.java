package My_package;

import java.util.Scanner;

public class Bubbulesort_A {

  public static void main(String[] args) {
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter Size of array: ");
    int size=SC.nextInt();
    int [] arr=new int[size];           
    System.out.println("Enter Elements: ");
    for(int i=0;i<size;i++) {
      arr[i]=SC.nextInt();
    }
    System.out.println("Before sorting");
    for(int i:arr)
      System.out.println(i+ " ");
    for(int i=1;i<=size;i++) {
      for(int j=0;j<size-i;j++) {
        if(arr[j]>arr[j+1]) {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println("After sorting");
    for(int i:arr)
      System.out.println(i+" ");
    SC.close();
  }
}