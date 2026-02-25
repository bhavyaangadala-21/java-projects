package Mypackage;
import java.util.Scanner;
public class InsertPos_method{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1]; 

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter the position (1 to " + (n + 1) + "): ");
        int pos = sc.nextInt();
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

       
        arr[pos - 1] = element;

        System.out.println("Array after insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}