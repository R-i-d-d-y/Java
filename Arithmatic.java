
package basicjava;
import java.util.Scanner;
public class Arithmatic {
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
    int  a,b, sum,dif,mult,rem;
    System.out.println("Enter two variables:");
    System.out.println("Enter the value of a:");
    a=input.nextInt();
    System.out.println("a="+a);
    System.out.println("Enter the value of b:");
    b=input.nextInt();
    System.out.println("b="+b);
    sum=a+b;
    System.out.println("Sum="+sum);
    dif=a-b;
    System.out.println("Difference is="+dif);
    mult=a*b;
     System.out.println("multiplication is="+mult);
     double div=(double)a/b;
      System.out.println("Division is="+div);
      rem=a%b;
       System.out.println("Reminder is="+rem);
    }
}
