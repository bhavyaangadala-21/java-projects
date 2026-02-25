package Mypackage;
import java.util.Scanner;
public class Array_2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int c,r;
	    System.out.println("enter the row:");
	    r = sc.nextInt();
	    System.out.println("enter the column:");
	    c = sc.nextInt();
	    int[][] tab = new int[r][c];
	    System.out.println("enter" +(r*c)+ "values:");
	    for (int i=0; i<r; i++) {
	      for (int j=0; j<c; j++) {
	        tab[i][j] = sc.nextInt();
	      }
	    }
	    System.out.println("table");
	    for (int i=0; i<r; i++) {
	      for (int j=0; j<c; j++) {
	        System.out.print(tab[i][j]+ "\t");
	      }
	    }
	    sc.close();

	}

}
