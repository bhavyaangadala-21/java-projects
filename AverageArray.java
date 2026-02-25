package Mypackage;

import java.util.Scanner;

public class AverageArray {
    public static float average(int[]arr) {
	
		
		float avg,sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
		return avg;
		
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
    	int []arr=new int[n];
    	System.out.println("Enter the elements:");
    	for(int i=0;i<n;i++) {
    		arr[i]=sc.nextInt();
    		
    	}
    	float res=average(arr);
    	System.out.println("Average = "+res);
    	sc.close();
    }
	}

