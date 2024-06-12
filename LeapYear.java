
package basicjava;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
      int year;
      System.out.print("Enter  Year:");
      year=input.nextInt();
      System.out.println("Your Entired number is:"+year);
      if(year%400==0||year%4==0&&year%100!=0)
      {
          System.out.println("The entired year is leap year...");
      }
      else
      {
          System.out.print("Not leap year...");
      }
    }
    
}
