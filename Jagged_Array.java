package Mypackage;
import java.util.Scanner;
public class Jagged_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    int r = sc.nextInt();
	      int[][] jagged = new int[r][];
	    for(int i=0; i<r; i++) {
	      System.out.println("enter "+(i+1)+"row - column size:");
	      int c= sc.nextInt();
	        jagged[i] = new int[c];
	        System.out.println("enter "+c+"values: ");
	      for(int j=0; j<jagged[i].length;j++)
	        jagged[i][j]= sc.nextInt();
	    }
	    System.out.println("jagged array is :");
	    for(int i=0; i<jagged.length;i++)
	    {
	      for(int j=0; j<jagged[i].length; j++) {
	        System.out.print(jagged[i][j]+" ");
	        
	      }
	    System.out.println();
	    }
	    sc.close();
		
	}

}
