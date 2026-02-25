package Mypackage;
class pro{
  private int productId;
    private String productName;
    private double price;

    // Parameterized Constructor
    pro(int id, String name, double p) {
        productId = id;
        productName = name;
        price = p;
    }

    public void display() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
    }

    public void checkPrice(double threshold) {
        if (price > threshold)
            System.out.println("product price :" + threshold);
        else
            System.out.println("product price :" + threshold);
    }
}
public class StoreDemo {

  public static void main(String[] args) {
    pro p1 = new pro(101, "Laptop", 55000.0);
        pro p2 = new pro(102, "Headphones", 1500.0);

        System.out.println("Product 1 Details:");
        p1.display();
        p1.checkPrice(5000);

        System.out.println("\nProduct 2 Details:");
        p2.display();
        p2.checkPrice(5000);
    }


  }