
package basicjava;
import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Enter a digit between 0 to 9:");
        n=input.nextInt();
        System.out.println("n="+n);
        if(n==0)
        {
            System.out.println("Zero");
        }
        else if(n==1)
        {
            System.out.println("One");
        }
         else if(n==2)
        {
            System.out.println("Two");
        }
         else  if(n==3)
        {
            System.out.println("Three");
        }
          else  if(n==4)
        {
            System.out.println("Four");
        }
            else if(n==5)
        {
            System.out.println("Five");
        }
            else  if(n==6)
        {
            System.out.println("Six");
        }
             else  if(n==7)
        {
            System.out.println("Seven");
        }
              else  if(n==8)
        {
            System.out.println("Eight");
        }
               else  if(n==9)
        {
            System.out.println("Nine");
        }
        else
               {
                   System.out.println("Not a digit between 0 to 9...");
               }
        
    }
}
