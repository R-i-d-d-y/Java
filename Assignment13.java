
package basicjava;
import java.util.Scanner;
public class Assignment13 {
     public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
       int n;
       System.out.println("Enter which fibonacci number you want to see:");
       n=input.nextInt();
       int first=0;
       int second=1;
       int fibo=0,i;
       for(i=3;i<=n;i++)
       {
          fibo=first+second;
          first=second;
          second=fibo;
       }
       System.out.println("Your"+n+"th fibonacci number is :"+fibo);
    }
}
