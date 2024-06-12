
package basicjava;
import java.util.Scanner;
public class PassFail {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int marks;
        System.out.print("Enter your marks:");
        marks=input.nextInt();
        if(marks>=33)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
