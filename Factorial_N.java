
package basicjava;
import java.util.Scanner;

public class Factorial_N 
{
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       int i,n,fact=15;
       System.out.println("Enter the number you want to see in factorial:");
       n=input.nextInt();
               for(i=1;i<=n;i++)
               {
                 fact=fact*i;  
               }
               System.out.println("Factorial of "+n+" is :"+fact);
    }
   
}
