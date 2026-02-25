package SortingTechniques;
import java.util.Scanner;

class QuickSortGeneric<T extends Comparable<T>> {
    void quickSort(T[] a, int si, int ei) {
        if (si < ei) {
            int j = partition(a, si, ei); // int pi = partition(a, si, ei);
            quickSort(a, si, j - 1); // quicksort(a, si, pi-1);
            quickSort(a, j + 1, ei); // quicksort(a, pi+1, ei);
        }
    }

    int partition(T[] a, int si, int ei) {
        T pivot = a[si];
        int i = si;
        int j = ei + 1;

        do {
            do {
                i++;
            } while (i <= ei && a[i].compareTo(pivot) < 0);
            do {
                j--;
            } while (a[j].compareTo(pivot) > 0);
            if(i<j) {
                swap(a, i, j);
            }
        }while(i<j);
        swap(a, si, j);
        return j;
    }

    void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

public class QuickSort {
  public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);

            System.out.println("Select data type:");
            System.out.println("1. Integer");
            System.out.println("2. Double");
            System.out.println("3. String");
            int choice = sc.nextInt();

            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            switch (choice) {

                case 1:
                    Integer[] intArr = new Integer[n];
                    System.out.println("Enter integer elements:");
                    for (int i = 0; i < n; i++)
                        intArr[i] = sc.nextInt();

                    QuickSortGeneric<Integer> qsInt = new QuickSortGeneric<>();
                    qsInt.quickSort(intArr, 0, n - 1);

                    System.out.println("After sorting:");
                  for(int i=0;i<n;i++) {
                    System.out.print(intArr[i]+" ");
                  }
                    break;

                case 2:
                    Double[] doubleArr = new Double[n];
                    System.out.println("Enter double elements:");
                    for (int i = 0; i < n; i++)
                        doubleArr[i] = sc.nextDouble();

                    QuickSortGeneric<Double> qsDouble = new QuickSortGeneric<>();
                    qsDouble.quickSort(doubleArr, 0, n - 1);

                    System.out.println("After sorting:");
                    for(int i=0;i<n;i++) {
                      System.out.print(doubleArr[i]+" ");
                    }
                    break;

                case 3:
                    String[] strArr = new String[n];
                    System.out.println("Enter string elements:");
                    for (int i = 0; i < n; i++)
                        strArr[i] = sc.next();

                    QuickSortGeneric<String> qsString = new QuickSortGeneric<>();
                    qsString.quickSort(strArr, 0, n - 1);

                    System.out.println("After sorting:");
                    for(int i=0;i<n;i++) {
                      System.out.print(strArr[i]+" ");
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            sc.close();
        }
}
