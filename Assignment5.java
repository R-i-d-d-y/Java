
package basicjava;
import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int age;
        System.out.println("Enter age:");
        age=input.nextInt();
        System.out.println("Your Entired age is:"+age);
        if(age>=18)
        {
            System.out.println("Valid votar...");
        }
        else
        {
            System.out.println("Invalid votar...");
        }
    }
    
}
