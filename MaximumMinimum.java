
package basicjava;
import java.util.Scanner;
public class MaximumMinimum {
    public static void main(String[] args)
    {
     Scanner input=new Scanner(System.in);
      int num1,num2;
      System.out.print("Enter  Numbers:");
      num1=input.nextInt();
      System.out.println("Your Entired number is:"+num1);
      num2=input.nextInt();
      System.out.println("Your Entired number is:"+num2);
      if(num1>num2)
      {
            System.out.printf("\n %d is Greater than %d",num1,num2);
      }
      else
      {  
          System.out.printf("\n %d is Greater than %d",num2,num1);
      }
    }
      
}
