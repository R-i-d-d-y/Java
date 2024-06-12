
package basicjava;

import java.util.Scanner;
public class Sum_of_2468_up_to_n 
{
   public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in); 
       int n,sum=0,i;
       System.out.print("Enter last number:");
       n=input.nextInt();
       for(i=2;i<=n;i=i+2)
       {
           sum=sum+i;
       }
       System.out.print("Sum="+sum);
    }  
}
