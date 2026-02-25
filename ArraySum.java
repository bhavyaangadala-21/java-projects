package Mypackage;
import java.util.Scanner;
public class ArraySum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int sum=0,prod = 1;
    System.out.println("Enter size of an array : ");
    int n = sc.nextInt();
    int[] numbers = new int[n];
    System.out.println("Enter values : ");
    for(int i=0;i<n;i++) {
      numbers[i] = sc.nextInt();
      sum += numbers[i];
      prod *= numbers[i];
    }
    System.out.println("Sum = "+sum);
    System.out.print("Product = "+prod);
    sc.close();
  }
  

}