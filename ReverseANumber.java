
package basicjava;
import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n,temp;
        System.out.print("Enter a number:");
        n=input.nextInt();
        while(n!=0)
        {
           temp=n%10;
           System.out.print(" "+temp+" ");
           n=n/10;
        }
                
    }
    
}
