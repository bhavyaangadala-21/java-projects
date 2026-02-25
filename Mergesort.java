package SortingTechniques;
import java.util.*;


//GenericMergeSort.java
class MergeSortt<T extends Comparable<T>> {
  public void mergeSort(T[] arr, int si, int ei) {
     if (si < ei) {
         int mi = (si + ei) / 2;
         mergeSort(arr, si, mi);
         mergeSort(arr, mi + 1, ei);
         merge(arr, si, mi, ei);
     }
  }
  
  public void merge(T [] arr, int si, int mi, int ei) {
      int i = si;
      int j = mi + 1;
      int k = 0;
      T[] temp = Arrays.copyOfRange(arr, si, ei + 1);
      while (i <= mi && j <= ei) {
        //if (arr[i].compareTo(arr[j]) >= 0)  for descending order 
          if (arr[i].compareTo(arr[j]) <= 0) {
              temp[k++] = arr[i++];
          } else {
              temp[k++] = arr[j++];
          }
      }
      while (i <= mi) {
          temp[k++] = arr[i++];
      } 
      while (j <= ei) {
          temp[k++] = arr[j++];
      }
      for (int x = si, y = 0; x <= ei; x++, y++) {
          arr[x] = temp[y];
      }
  }
}

public class MergeSort {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Merge sort");
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
                    MergeSortt<Integer> oi = new MergeSortt<>();
                    System.out.println(" Before Sorting:");
                    for(int i=0;i<intArr.length;i++)
                    {
                      System.out.print(intArr[i]+"  ");
                    }
                    
                  oi.mergeSort(intArr, 0, n - 1);

                    System.out.println("Sorted Integers:");
                    for(int i=0;i<intArr.length;i++)
                      {
                        System.out.print(intArr[i]+"  ");
                      }
                    break;

                case 2:
                    Double[] doubleArr = new Double[n];
                    System.out.println("Enter doubles:");
                    for (int i = 0; i < n; i++)
                        doubleArr[i] = sc.nextDouble();

                    MergeSortt<Double> od = new MergeSortt<>();
                    od.mergeSort(doubleArr, 0, n - 1);
                    System.out.println(" Before Sorting:");
                      for(int i=0;i<doubleArr.length;i++)
                      {
                        System.out.print(doubleArr[i]+"  ");
                      }
                      
                    od.mergeSort(doubleArr, 0, n - 1);

                      System.out.println("Sorted Double numbers:");
                      for(int i=0;i<doubleArr.length;i++)
                        {
                          System.out.print(doubleArr[i]+"  ");
                        }
                      break;

                case 3:
                    String[] strArr = new String[n];
                    System.out.println("Enter strings:");
                    for (int i = 0; i < n; i++)
                        strArr[i] = sc.next();
                    System.out.println(" Before Sorting:");
                      for(int i=0;i<strArr.length;i++)
                      {
                        System.out.print(strArr[i]+"  ");
                      }
                   MergeSortt<String> os = new MergeSortt<>();
                 os.mergeSort(strArr, 0, n - 1);

                      System.out.println("Sorted Strings:");
                      for(int i=0;i<strArr.length;i++)
                        {
                          System.out.print(strArr[i]+"  ");
                        }
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            sc.close();
        }
}
