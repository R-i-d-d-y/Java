
package basicjava;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n=input.nextInt();
        int temp,sum=0;
        while(n!=0)
        {
            temp=n%10;
            sum=sum+temp;
            n=n/10;
            
        }
        System.out.println("Sum of digit is:"+sum);
    }
}
