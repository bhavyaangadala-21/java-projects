package Mypackage;
import java.util.Scanner;
public class Symmetricmatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column size ");
		int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] A=new int [r][c];
        System.out.println("Enter the values");
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		A[i][j] = sc.nextInt();
        	}
        }
        
	}

}
