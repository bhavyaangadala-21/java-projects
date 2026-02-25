package Mypackage;

class Shape {
  protected double length;
  protected double breadth;
  Shape(double l, double b){
    length = l;
    breadth = b;
  }
  public double area(double l, double b) {
    double ar = l*b;
    return ar;
  }
}

class Rectangle_ extends Shape {
  Rectangle_(double l, double b){
    super(l,b);
  }
  public void Area() {
    double ar = super.area(length, breadth);
    System.out.println("Area of rectangle = " + ar);
  }
}

class Cuboid extends Rectangle_ {
  private double height;
  Cuboid(double l, double b, double h){
    super(l,b);
    height = h;
  }
  public void Volume() {
    double vol = super.area(length, breadth) * height;
    System.out.println("Volume of cuboid = " + vol);
  }
  
}

public class ShapesmultiInheritance {
  public static void main(String[] args) {
    Cuboid c = new Cuboid(3, 4, 5);
    c.Area();
    c.Volume();
  }
}
