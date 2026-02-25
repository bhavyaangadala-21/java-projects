package Mypackage;
class Box{
	private double length;
	private double width;
	private double height;
	Box()  //default constructor
	{
		length = 10;
		width = 20;
	    height = 15;
	}
	Box(double l,double w,double h){
		length = l;
		width = w;
	    height = h;
	}
	Box(javax.swing.Box b){
		length =b.length;
		width = b.width;
		height =b.height;
	}
	public double volume() {
		double vol =length*width*height;
		return vol;
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(20,12,34);
		Box b3 = new Box();
		System.out.println("Box-1 Volume : "+b1.volume());
		System.out.println("Box-2 Volume : "+b2.volume());
		System.out.println("Box-3 Volume : "+b3.volume());
	}

}
