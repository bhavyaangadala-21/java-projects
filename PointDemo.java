package Mypackage;
class Point {
    private int x;
    private int y;
    Point(int a, int b) {
        x = a;
        y = b;
    }
    Point(Point p) {
        x = p.x;
        y = p.y;
    }
    public void display() {
        System.out.println("Coordinates: "+x+","+y);
    }
}
public class PointDemo {
  public static void main(String[] args) {
    Point p1 = new Point(5, 10);   // parameterized constructor
        Point p2 = new Point(p1);      // copy constructor

        System.out.println("Original Point:");
        p1.display();

        System.out.println("Copied Point:");
        p2.display();

  }

}
