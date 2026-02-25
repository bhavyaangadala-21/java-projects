package Mypackage;

public class EvenOddpos {

	public static void main(String[] args) { 

		import java.util.Scanner;

		public class EvenOddpos {

		  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int size, oddsum=0, evensum=0, oddcount=0, evencount=0;
		    float oddavg, evenavg;
		    System.out.print("Enter size of array : ");
		      size = sc.nextInt();
		      
		      int [] a = new int[size];
		      for(int i=0; i<size; i++) {
		        System.out.print("Enter element "+ (i+1) + " : ");
		        a[i] = sc.nextInt();
		        if(i %2 ==0) {
		            evencount = evencount + 1;
		            evensum = evensum + a[i];
		        } else {
		            oddcount = oddcount + 1;
		            oddsum = oddsum + a[i];
		        }
		      }
		      
		      evenavg = (float)evensum/evencount;
		      oddavg = (float)oddsum/oddcount;
		      
		      System.out.println("Avg of even position numbers = " +evenavg);
		      System.out.println("Avg of odd position numbers = " +oddavg);
		      
		    sc.close();

		  }

		}

	}

}
