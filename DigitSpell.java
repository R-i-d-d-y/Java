
package basicjava;
import java.util.Scanner;
public class DigitSpell {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int digit;
        System.out.print("Enter a digit:");
        digit=input.nextInt();
        System.out.print("\nYour entired digit is:  ");
        switch(digit)
        {
            case 0:
                System.out.print("Zero\n");
                break;
            case 1:
                System.out.print("One\n");
                  break;
            case 2:
                System.out.print("Two\n");
                  break;
            case 3:
                System.out.print("Three\n");
                  break;
            case 4:
                System.out.print("Four\n");
                  break;
            case 5:
                System.out.print("Five\n");
                  break;
            case 6:
                System.out.print("Six\n");
                  break;
            case 7:
                System.out.print("Seven\n");
                  break;
            case 8:
                System.out.print("Eight\n");
                  break;
            case 9:
                System.out.print("Nine\n");
                  break;
                  
            default:
                System.out.print("Not a digit\n");
        }
    }
    
}
