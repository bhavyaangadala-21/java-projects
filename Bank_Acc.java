package my_package;

class Account{
  private long AccNo;
  private double balance;
  private double interest_rate;
  private String AccType;
  public void setDetails(long a,double b,double r , String t) {
    AccNo=a;
    balance=b;
    interest_rate=r;
    AccType=t;
  }
  public void deposite(double amt) {
    balance+=amt;
  }
  public void withdraw(double amt) {
    if(balance>=amt) {
      balance=balance-amt;
    }
    else {
      System.out.println("insufficient Balance");
    }
  }
  public void interestRate() {
    if(AccType.equals("saving"))
      balance += balance*(interest_rate/100.0);
    else
      System.out.println("Interest is not Applicable");
  }
  public void display() {
    System.out.println("Account Number :"+AccNo);
    System.out.println("Balance : "+balance);
    System.out.println("Account Type : "+AccType);
  }
}
public class BankAccount {

  public static void main(String[] args) {
    Account c1=new Account();
    Account c2=new Account();
    Account c3=new Account();
    System.out.println("Enter details of 1 customer :");
    c1.setDetails(2510030038L, 9000000, 5, "saving");
    c1.withdraw(14000);
    System.out.println("Details of 1 customer after withdrawal");
    c1.display();
    System.out.println(" ");
    System.out.println("Enter details of 2 customer :");
    c2.setDetails(2510040040L, 1000000, 5, "current");
    c2.deposite(15000);
    System.out.println("Details of 2 customer after Deposite");
    c2.display();
    System.out.println(" ");
    System.out.println("Enter details of 3 customer :");
    c3.setDetails(25100301985L, 1500000, 5, "saving");
    c3.interestRate();
    System.out.println("Details of 3 customer after Interest Calculation");
    c3.display();
    

  }

}