
package basicjava;
import java.util.Scanner;
public class Sum_of_m_to_n 
{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      int i,m,n,sum=0;
      System.out.println("Enter initial value:");
      m=input.nextInt();
      System.out.println("Enter terminating value:");
      n=input.nextInt();
      for(i=m;i<=n;i++)
      {
          sum=sum+i;
      }
      System.out.println("Tne sum of "+m+" to "+n+" is:"+sum);
    }
}
