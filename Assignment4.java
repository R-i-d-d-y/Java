
package basicjava;
import java.util.Scanner;
public class Assignment4 

{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int phoneprice=1800;
        int numberofinstallment,installmentpermonth;
        System.out.println("Number of installment=");
        numberofinstallment=input.nextInt();
        System.out.println("installment is:"+numberofinstallment);
        installmentpermonth=phoneprice/numberofinstallment;
        System.out.println("Monthly installment amount:"+installmentpermonth+" Euro");
    }
}
