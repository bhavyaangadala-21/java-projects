package Mypackage;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix A");
        int r=SC.nextInt();
        int c=SC.nextInt();
        int [][] A=new int [r][c];
        System.out.println("Enter values of Matrix A ");
         for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
                A[i][j]=SC.nextInt();
            }
        }
        for (int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println(" ");
        }
        SC.close();

	}

} 
