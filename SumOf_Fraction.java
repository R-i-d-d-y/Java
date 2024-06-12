
package basicjava;
import java.util.Scanner;
public class SumOf_Fraction 
{
   public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in); 
       double n,sum=0,i;
       System.out.print("Enter last number:");
       n=input.nextInt();
       for(i=1.5;i<=n;i=i+2)
       {
           sum=sum+i;
       }
       System.out.println("Sum="+sum);
    }  
}
