package Mypackage;
import java.util.Scanner;
public class Ascendingorder_Array {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 0; j < size - i; j++) {
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.print("elements after sorting in ascending order: ");
        for (int i : arr)
            System.out.print(i + " ");
        
        sc.close();

  }

}