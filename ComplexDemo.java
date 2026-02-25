package Mypackage;

class complex {
  private double real;
  private double imag;
  public void getComplex(double r, double i) {
    real = r;
    imag = i;
  }
  public complex addition(complex c1, complex c2) {
    this.real = c1.real+c2.real;
    this.imag = c1.imag+c2.imag;
    return this;
  }
  public complex subtraction(complex c1, complex c2) {
    this.real = c1.real-c2.real;
    this.imag = c1.imag-c2.imag;
    return this;
  }
  public void display() {
    System.out.println(real+" + "+imag+"i");
  }
}

public class ComplexDemo {

  public static void main(String[] args) {
    complex c1 = new complex();
    complex c2 = new complex();
    complex c3 = new complex();
    complex c4 = new complex();
    c1.getComplex(3, 5);
    c2.getComplex(6, 2);
    System.out.print("Complex number1: ");
    c1.display();
    System.out.print("Complex number2: ");
    c2.display();
    c3.addition(c1,c2);
    System.out.print("Addition = ");
    c3.display();
    c4.subtraction(c1,c2);
    System.out.print("Subtraction = ");
    c4.display();
  }

}