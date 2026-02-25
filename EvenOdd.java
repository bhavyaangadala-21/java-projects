package Mypackage;
import java.util.Scanner;

public class CountEvenOddForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        int evenCount = 0, oddCount = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 1; i <= n; i++) { -
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);

        sc.close();
    }
}
