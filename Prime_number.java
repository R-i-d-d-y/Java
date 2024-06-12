
package basicjava;
import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int n,i,count=0;
    System.out.println("Enter a number:");
    n=input.nextInt();
    if(n==0||n==1)
        {
            System.out.println("not a prime number");
        }
    else{
    for(i=2;i<n;i++)
    {
        
         if(n%i==0)
        {
            count++;
        break;
        }
        }
    if(count==0)
    {System.out.println("Prime Number");
    }
    else
    {
        System.out.println("Not a prime number");
    }
   }
    }
}
