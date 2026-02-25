public class BubbleSort{
      public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
          int n = arr.length;
         // boolean swapped;
          for (int i = 0; i < n - 1; i++){
             // swapped = false
              for (int j = 0; j < n - 1 - i; j++){
                  if (arr[j].compareTo(arr[j + 1]) > 0){        
                      T temp = arr[j];
                      arr[j] = arr[j + 1];
                      arr[j + 1] = temp;
                  }
              }
          }
      }
  }
  

import java.util.Scanner;
public class BubbleSortDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Choose data type:");
        System.out.println("1. Integer");
        System.out.println("2. Double");
        System.out.println("3. String");
        int choice = sc.nextInt();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        switch (choice) {
            case 1:
                Integer[] intArr = new Integer[n];
                System.out.println("Enter integers:");
                for (int i = 0; i < n; i++)
                    intArr[i] = sc.nextInt();
                BubbleSort.bubbleSort(intArr);
                System.out.println("Sorted Integers:");
                for(int i=0;i<intArr.length;i++){
                  System.out.println(intArr[i]);
                }
                break;
            case 2:
                Double[] doubleArr = new Double[n];
                System.out.println("Enter doubles:");
                for (int i = 0; i < n; i++)
                    doubleArr[i] = sc.nextDouble();
                BubbleSort.bubbleSort(doubleArr);
                System.out.println("Sorted Doubles:");
                for(int i=0;i<doubleArr.length;i++){
                  System.out.println(doubleArr[i]);
                }
                break;
            case 3:
                String[] strArr = new String[n];
                System.out.println("Enter strings:");
                for (int i = 0; i < n; i++)
                    strArr[i] = sc.next();
                BubbleSort.bubbleSort(strArr);
                System.out.println("Sorted Strings:");
                for(int i=0;i<strArr.length;i++){
                  System.out.println(strArr[i]);
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
  }
}


Bubble Sort