
package basicjava;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n;
       System.out.println("Enter how many numbers:");
       n=input.nextInt();
       int first=0;
       int second=1;
       System.out.print(first+" "+second);
       int fibo,i;
       for(i=3;i<=n;i++)
       {
          fibo=first+second;
          System.out.print(" "+fibo);
          first=second;
          second=fibo;
       }
       System.out.print("\n");
    }
}
