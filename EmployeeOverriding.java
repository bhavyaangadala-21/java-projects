package Mypackage;
class Employee {
	  protected String name;
	  protected double baseSalary;
	  Employee (String n, double b){
	    name = n;
	    baseSalary = b;
	  }
	  public void getSalary() {
	    System.out.println("Salary : "+baseSalary);
	  }
	}

	class Manager extends Employee {
	  private double bonus;
	  Manager(String n, double b, double bp){
	    super(n,b);
	    bonus = bp;
	  }
	  public void getSalary() {
	    baseSalary += (bonus/100);
	    System.out.println("salary : " + baseSalary);
	  }
	}

	public class EmployeeOverriding {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    Employee e = new Employee("A", 100000);
	    e.getSalary();
	    e = new Manager("B", 100000, 1500);
	    e.getSalary();
	    
	  }

	}