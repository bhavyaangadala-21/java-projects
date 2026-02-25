package Mypackage;
class vehicle{
	String brand;
	Double price;
	vehicle(String brand, double price){
		this.brand=brand;
		this.price=price;
	}
	public void display() {
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		
	}
}
class Car_ extends vehicle{
	int mileage;
	String fueltype;
	Car_(String brand, double price, int mileage, String fueltype){
		super(brand, price);
		this.mileage=mileage;
		this.fueltype=fueltype;
	}
	public void display() {
		super.display();
		System.out.println("Mileage:"+mileage);
		System.out.println("Fueltype:"+fueltype);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		vehicle v = new vehicle("TATA",150000.0);
		v.display();
		Car_ c = new Car_("TATA",350000,15,"petrol");
		c.display();

	}

}
