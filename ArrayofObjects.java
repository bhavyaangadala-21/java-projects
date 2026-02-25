package Mypackage;
import java.util.Scanner;
class student{
	private int rollno;
	 private String name;
	 private double[] percentage;
	student(int n,String s,double percentage){
		this.rollno = n;
		this.name = s;
		this.percentage= per;
		
	}
	public void display() {
		System.out.println("student name:" +name);
		System.out.println("student rollno:" +rollno);
		for(int i=0;i<st.length;i++) {
			System.out.println(percentage[i]+" ");
			
		}
		System.out.println(" ");
}
public class ArrayofObjects {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        student[]st = new student[n];
        for(int i=0;i<st.length;i++) {
        	System.out.println("enter student"+(i+1)+"details");
        	int rollno = sc.nextInt();
        	String name = sc.next();
        	double per  =sc.nextDouble();
        	st[i] = new student(rollno,name,percentage);
        	
        	
        }
        for(int i=0;i<st.length;i++) {
        	System.out.println("student"+(i+1)+"details");
        	st[i].display();
        	
        }
        
	}

}
