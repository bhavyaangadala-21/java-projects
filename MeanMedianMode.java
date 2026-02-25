package Mypackage;
import java.util.Scanner;
public class MeanMedianMode {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number Array Elements:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter " + n + " elements");

    for(int i=0; i<n;i++) {
      arr[i] = sc.nextInt();
    }
    
    double sum=0;
    for(int i=0;i<n;i++) {
      sum+=arr[i];
    }
    
    double mean=0;
    mean=sum/n;
    for(int i=0;i<n-1;i++) { 
      for(int j=0;j<n-i-1;j++) { 
        if(arr[j]>arr[j+1]) {
          int temp=arr[j]; 
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }

    double median;
    if(n%2==0) {
       median= ((double)arr[n/2] + arr[(n/2)-1]) / 2;  
    } else {
      median = arr[n/2];
    }
    
    // Mode 
    int maxmode = 0;
        int mode = arr[0]; 
    
    for(int i=0; i<n; i++) {
      int count = 0;
      for(int j=0; j<n; j++) { 
        if(arr[i] == arr[j])
          count++;
      }
      if(count > maxmode) {
        maxmode = count;
        mode = arr[i];
      }
    }
    System.out.println("mean of array elements:"+mean);
    System.out.println("Median of array elements: "+median);
    System.out.println("Mode is " + mode);
    sc.close();
  }
},