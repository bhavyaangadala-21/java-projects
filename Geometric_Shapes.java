package Mypackage;
abstract class shape{
	protected String colour;
	shape(String colour){
		this.colour= colour;
		}
	abstract double area();
	
}
class circle extends shape{
	private double radius;
	circle(String colour , double radius){
		super(colour);
		this.radius = radius;
		
	}
	double area() {
		return Math.PI*radius*radius;
		
	}
}
class triangle extends shape{
	private double base;
	private double height;
    triangle(String colour , double base , double height){
    	super(colour);
    	this.base = base;
    	this.height = height;
    }
    double area() {
    	return 0.5*base*height;
    }
    
}
public class Geometric_Shapes {

	public static void main(String[] args) {
		shape c = new circle("white",5);
		System.out.println("circle :"+c.colour+"cicle area :"+c.area());
		shape t = new triangle("black",8,8);
		System.out.println("triangle :"+t.colour+"triangle area :"+t.area());
	}

}
