package Mypackage;
class ElectricityBill {
  private String Cname;
  private int Cid;
  private int units;
  private double bill;
  public void inputDetails(String n,int id,int un) {
   Cname=n;
   Cid=id;
   units=un;   
  }
  public void CalculateBill() {
   if(units<=100)
    bill=units*1.50;
   else if(units<=200)
    bill = (100*1.50)+(units-100)*2.50;
   else
    bill=(100*1.50)+(100*2.50)+(units-200)*4;
  }
    public void Display()
    {
     System.out.println("Customer name :"+Cname);
     System.out.println("Customer id :"+Cid);
     System.out.println(" units Consumed  :"+units);
     System.out.println("Total bill :"+bill);
    }
 public static void main(String[] args) {
  ElectricityBill E=new ElectricityBill();
  E.inputDetails("XYZ", 3241562, 290);
        E.CalculateBill();
        E.Display();
      
 }

}