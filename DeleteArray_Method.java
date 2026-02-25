package Mypackage;
import java.util.Scanner;
public class DeleteArray_Method {

    static public void Deleteitem1(int[] a, int ele) {
        int pos = 0;
        boolean found = false;
        int n = a.length;
        for(int i=0; i<a.length; i++) {
          if(a[i] == ele) {
            pos = i;
            found = true;
            for(int j=pos;j<n-1;j++)
              a[j] = a[j+1];
          }
          }
        n--;
        if(found == true) {
          System.out.print("Array after deletion : ");
              for (int i=0;i<n;i++) 
                  System.out.print(a[i]+ " ");
        }
          
              else
                  System.out.println("Deletion not possible");
          
        }
      
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + " : ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter element to delete : ");
            int elem = sc.nextInt();
            Deleteitem1(arr, elem);
            sc.close();

      }

}