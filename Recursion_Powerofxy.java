package Mypackage;
import java.util.Scanner;
public class Recursion_Powerofxy {
      public static long power(int x, int y) {
          if (y == 0) return 1; 
          else return x * power(x, y - 1); 
      }

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter  (x): ");
          int x = sc.nextInt();
          System.out.print("Enter  (y): ");
          int y = sc.nextInt();

          long res= power(x, y);

          System.out.println(x + " raised to the power " + y + " is " + res);
          sc.close();
  }  
}
