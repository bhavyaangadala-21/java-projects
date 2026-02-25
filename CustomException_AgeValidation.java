package Mypackage;
import java.util.Scanner;

class InvalidAgeException extends Exception{
  InvalidAgeException(String msg){
    super(msg);
  }
}
class AgeLimtException extends Exception{
  AgeLimtException(String msg){
    super(msg);
  }
}
public class CustomException_AgeValidation {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try {
      int age=sc.nextInt();
      if(age<0) {
        throw new InvalidAgeException("You Are Not Born Yet! \nCome Back After Delivery");
      }
      if(age>100) {
        throw new AgeLimtException("Age Exceeds Human Limit \nAre You Ashwadhammama!");        
      }
      System.out.println("Age "+age+" is Valid");
    }
    catch(InvalidAgeException e){
      System.out.println("Error: "+e.getMessage());
    }
    catch(AgeLimtException e){
      System.out.println("Error: "+e.getMessage());
    }
    finally {
      System.out.println("Code executed successfully");
    }
  }
}