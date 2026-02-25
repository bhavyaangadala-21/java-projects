package my_package;

class Employee{
  private int ID;
  private String name;
  private String designation;
  private int salary;
  public void readDetails(int n,String s, String d,int sal) {
    ID=n;
    name=s;
    designation=d;
    salary=sal;
  }
  public void displayDetails(){
    System.out.println("ID Number : "+ID);
    System.out.println("Name  : "+name);
    System.out.println("Designation : "+designation);
    System.out.println("Salary : "+salary);
  }
}
public class EmployeeDetails {

  public static void main(String[] args) {
    Employee s=new Employee();
    s.readDetails(012, "XYZ", "Lecture", 900000);
    s.displayDetails();
    System.out.println("------------------");
    Employee s1=new Employee();
    s1.readDetails(123, "ABC", "HOD", 950000);
    s1.displayDetails();

  }
}