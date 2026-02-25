package Mypackage;
import java.util.Scanner;
public class ExceptionalError {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      try{
          System.out.println("Enter numerator and denominator:");
          int a=sc.nextInt();
          int b=sc.nextInt();
          int result=a/b;
          System.out.println(result);
          System.out.println("enter index:");
          int[]arr={25,45,67};
          int index=sc.nextInt();
          System.out.println("value at index"+index+" is:"+arr[index]);
      String str=null;
      System.out.println("length of string:"+str.length());
      }
      catch(ArithmeticException e){
          System.out.println("error:"+e.getMessage());
      }
      catch(ArrayIndexOutOfBoundsException e){
          System.out.println("error:"+e.getMessage());
      }
      catch(NullPointerException e){
          System.out.println("error"+e.getMessage());
      }
      finally {
        System.out.println("Code executed sucessfully");
        System.out.println("Reached end of file");
      }
      
      sc.close();
  }

}