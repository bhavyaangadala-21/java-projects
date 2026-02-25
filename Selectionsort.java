package SortingTechniques;
import java.util.Scanner;

class SelectionSortGeneric<T extends Comparable<T>>{
  public T[] selectionSort(T[]a) {
    int n = a.length;
    for(int i=0; i<n-1; i++) {
      int minIndex = i;
      T min = a[i];
      for(int j=i+1; j<n; j++) {
        if((a[j].compareTo(min))<0) {
          min = a[j];
          minIndex = j;
        }
      }
      T temp = a[i];
      a[i] = a[minIndex];
      a[minIndex] = temp;
    }
    return a;
  }
}

public class SelectionSort {
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
                SelectionSortGeneric<Integer> oi = new SelectionSortGeneric<>();
                Integer[] sortedInt = oi.selectionSort(intArr);
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
                SelectionSortGeneric<Double> oii = new SelectionSortGeneric<>();
                Double[] sortedDouble = oii.selectionSort(dblArr);
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
                SelectionSortGeneric<String> os = new SelectionSortGeneric<>();
                String[] sortedString = os.selectionSort(strArr);
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


Selection Sort
