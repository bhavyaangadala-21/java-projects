package Mypackage;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		float charge;
		
        if(units<=100)
        	charge=units*5;
        else if(units>100 && units<=200)
        	charge=(100)*5 + (units-100)*7;
        else
        	charge=(100)*5 + (100)*7 + (units-200)*10;
        
        System.out.println("Total bill: "+charge );
        sc.close();
       }
}