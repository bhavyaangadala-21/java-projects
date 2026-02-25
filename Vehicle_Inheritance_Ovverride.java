package Mypackage;
class Vehicless
{
    protected String brand;
    protected double speed;

    Vehicless(String brand, double speed)
    {
        this.brand = brand;
        this.speed = speed;
    }
    public void displayInfo()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicless
{
    protected String fuelType;
    
    Car(String brand, double speed, String fuelType)
    {
        super(brand, speed);
        this.fuelType = fuelType;
    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car
{
    protected int batteryCapacity;

    ElectricCar(String brand, double speed, String fuelType, int batteryCapacity)
    {
        super(brand, speed, fuelType);
        this.batteryCapacity = batteryCapacity;
    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity );
    }
}

public class Vehicle_Inheritance_Ovverride {

    public static void main(String[] args)
    {
        Vehicless v = new Vehicless("Kia", 120);
        v.displayInfo();

        System.out.println();

        Car c = new Car("Hyundai", 120, "Petrol");
        c.displayInfo();

        System.out.println();

        ElectricCar e = new ElectricCar("Tata", 150, "Electric", 75);
        e.displayInfo();
    }
}