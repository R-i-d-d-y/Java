
package basicjava;
import java.util.Scanner;
public class SumOfCube 
{ public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in); 
       int n,sum=0,i;
       System.out.print("Enter last number:");
       n=input.nextInt();
       for(i=1;i<=n;i++)
       {
           sum=sum+i*i*i;
       }
       System.out.print("Sum="+sum);
    }
    
}
