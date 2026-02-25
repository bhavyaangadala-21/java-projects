package Mypackage;
import java.util.Scanner;
class Rectangle
{
	private double length;
	private double width;
	public void getdetails(double l, double w) 
	{
		length = l;
		width = w;
		
	}
	public double area()
	{
		return length*width; 
	}
	public double perimeter()
	{
		return 2*(length+width);
		
	}
	public void display()
	{
		System.out.println("Length : "+length);
		System.out.println("Width : "+width);

	}
}
public class Rectangle_Demo {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle();
		Scanner sc = new Scanner(System.in);
		double l = sc.nextDouble();
		double w = sc.nextDouble();
		R1.getdetails(l, w);
		R1.display();
		System.out.println("Area  = "+R1.area());
		System.out.println("Perimeter  = "+R1.perimeter());
		sc.close();
		
	}

}
