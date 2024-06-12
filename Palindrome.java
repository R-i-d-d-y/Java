
package basicjava;
import java.util.Scanner;
public class Palindrome {
      public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n,temp,sum=0,r;
        System.out.print("Enter a number:");
        n=input.nextInt();
        temp=n;
        while(temp!=0)
        {
           r=temp%10;
           sum=sum*10+r;
           temp=temp/10;
        }
       if(n==sum)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
                
    }
}
