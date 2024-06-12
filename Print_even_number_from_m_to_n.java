
package basicjava;

import java.util.Scanner;
public class Print_even_number_from_m_to_n 
{
    public static void main(String[] args) 
    {
      Scanner input = new java.util.Scanner(System.in);
      int i,m,n,sum=0;
      System.out.println("Enter initial value:");
      m=input.nextInt();
      System.out.println("Enter terminating value:");
      n=input.nextInt();
      for(i=m;i<=n;i++)
      {
          if(i%2==0)
          sum=sum+i;
      }
      System.out.println("Tne sum of even number between "+m+" to "+n+" is:"+sum);
    }
        
    
}
