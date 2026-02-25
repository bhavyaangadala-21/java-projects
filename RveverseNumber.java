package Mypackage;
import java.util.Scanner;

public class RveverseNumber {

    public static int reverse(int num, int rev) {
        if (num == 0)
            return rev;
        else
            return reverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        System.out.println("Reverse number is: " + reverse(num, rev));
        sc.close();
    }
}
/