package Mypackage;

import java.util.Scanner;

public class Additionofmatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter row size and coloumn size of matrix A");
	    int r = sc.nextInt();
	    int c = sc.nextInt();
	    System.out.println("enter row size and colomn size of matrix B");
	    int r1 = sc.nextInt();
	    int c1 = sc.nextInt();
	    
	    if(r==r1 && c==c1) {
	    	int[][] A=new int[r][c];
	    	int[][] B=new int[r1][c1];
	    	System.out.println("Enter the values of matrix A");
	    	for (int i=0; i<r; i++) {
	    		for (int j=0; j<c; j++) {
	    			A[i][j]=sc.nextInt();
	    		}
	    	}
            int[][] add = new int[r][c];
            System.out.println("Enter the values of matrix B");
    	    for (int i=0; i<r1; i++) {
    	    	for (int j=0; j<c1; j++) {
    	    		B[i][j]	=sc.nextInt();
    	    	}
    	    }
    	    for (int i=0; i<r1; i++) {
    	    	for (int j=0; j<c1; j++) {
    	    		add[i][j]=A[i][j]+B[i][j];
    	    	}
    		}
    	    for (int i=0; i<r1; i++) {
    	    	for (int j=0; j<c1; j++) {
    	    		System.out.print(add[i][j]+ " ");
    	    	}
    	    	System.out.println(" ");
    	    }
	    }
	    else {
	    	System.out.println("matrix addition is not possible");
	    	
	    }
	    sc.close();
	}
}