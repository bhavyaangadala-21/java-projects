package SortingTechniques;
import java.util.Scanner;

class InsertionSortGenerics <T extends Comparable <T>>{
  public T[] insertionSort(T[] a) {
    int n = a.length;
    for(int i = 1; i < n; i++ ) {
      int j = i - 1;
      T temp = a[i];
      while((j >= 0) && (temp.compareTo(a[j]) < 0)) {
        a[j+1] = a[j];
        j--;
      }
      a[j+1] = temp;
    }
    return a;
  }
}

public class InsertionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose Data Type for Binary Search");
        System.out.println("1. Integer");
        System.out.println("2. Double");
        System.out.println("3. String");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter number of integers: ");
                int n1 = sc.nextInt();
                Integer[] intArr = new Integer[n1];
                System.out.println("Enter integer elements:");
                for (int i = 0; i < n1; i++) {
                    intArr[i] = sc.nextInt();
                }
                InsertionSortGenerics<Integer> oi = new InsertionSortGenerics<>();
                Integer[] sortedInt = oi.insertionSort(intArr);
                for(int i=0; i<sortedInt.length; i++) {
                  System.out.print(sortedInt[i] + " ");
                }
                break;
            case 2:
                System.out.print("Enter number of doubles: ");
                int n2 = sc.nextInt();
                Double[] dblArr = new Double[n2];
                System.out.println("Enter double elements:");
                for (int i = 0; i < n2; i++) {
                    dblArr[i] = sc.nextDouble();
                }
                InsertionSortGenerics<Double> oii = new InsertionSortGenerics<>();
                Double[] sortedDouble = oii.insertionSort(dblArr);
                for(int i=0; i<sortedDouble.length; i++) {
                  System.out.print(sortedDouble[i] + " ");
                }
                break;    
              case 3:
                System.out.print("Enter number of strings: ");
                int n3 = sc.nextInt();
                sc.nextLine(); // consume newline
                String[] strArr = new String[n3];

                System.out.println("Enter string elements:");
                for (int i = 0; i < n3; i++){
                    strArr[i] = sc.nextLine();
                }
                InsertionSortGenerics<String> os = new InsertionSortGenerics<>();
                String[] sortedString = os.insertionSort(strArr);
                for(int i=0; i<sortedString.length; i++) {
                  System.out.print(sortedString[i] + " ");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();

  }

}



Insertion Sort
