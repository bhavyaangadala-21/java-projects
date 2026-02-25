package Mypackage;

interface PaymentGateway{
	public void processPayment(double amount);
	
}
class CreditCardPayment implements PaymentGateway {
	private long card_no;
	private int cvv;
	private double limit;
	CreditCardPayment(long card_no,int cvv,double limit){
		this.card_no=card_no;
		this.cvv=cvv;
		this.limit=limit;
		
	}
	public void processPayment(double amount) {
		if(amount>limit)
			System.out.println("Amount processed: "+amount+" succesfully" +" with Card_no:"+card_no);
		else
			System.out.println("Failed to process the amount");
		
	}
}
class UPIPayment implements PaymentGateway{
	private String upi_id;
	private String bank_name;
	private double balance;
	
	UPIPayment(String upi_id,String bank_name ,double balance )
	{
		this.upi_id=upi_id;
		this.bank_name=bank_name;
		this.balance=balance;
	}
	public void processPayment(double amount)
	{
		if(amount>balance)
			System.out.println("Amount processed: "+amount+" succesfully" +" using upi_id:"+upi_id+" from bank:"+bank_name);
		else
			System.out.println("Insufficient balance");
	}
}


public class InterfacePayment {
	

	public static void main(String[] args) {
		PaymentGateway Customer1=new CreditCardPayment(45875,655,804);
		PaymentGateway Customer2=new UPIPayment("T123@axis","AXIS",5000);
		Customer1.processPayment(7000);
		Customer2.processPayment(7500);
	}

}
