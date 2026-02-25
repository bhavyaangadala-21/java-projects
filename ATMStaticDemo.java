package My_package;
class ATM{
  public static String Pincheck(int pin) {
    if(pin>=1000 && pin<=9999) {
      return "Valid";
    }
    else {
      return "Invalid";
    }
  }
}
public class ATMStaticDemo {
  public static void main(String[] args) {
    int pin1=1234;
    int pin2=12345;
    System.out.println("Entered number is : "+ATM.Pincheck(pin1));
    System.out.println("Entered number is : "+ATM.Pincheck(pin2));
  }

}