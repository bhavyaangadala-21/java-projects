package Mypackage;
import java.util.Scanner;
public class RemoveDuplicates {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++)
      a[i] = sc.nextInt();
    int newsize = 0;
    boolean[] visit = new boolean[n];
    int[] temp = new int[n];
    for(int i=0;i<n;i++)
    {
      boolean duplicate = false;
      if(!visit[i])
      {
        for(int j=i+1;j<n;j++)
        {
          if(a[i] == a[j])
          {
            duplicate = true;
            visit[j] = true;
            break;
          }
        }
      }
      if(!duplicate)
        temp[newsize++] = a[i];
    }
    for(int i=0;i<newsize;i++)
      System.out.print(temp[i]+" ");
    
  sc.close();    
  }

}