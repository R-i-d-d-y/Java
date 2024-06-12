
package basicjava;
import java.util.Scanner;
public class Weekdays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int day_number,i;
        String[] weekdays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Enter day numbers (1-7):");
        day_number=input.nextInt();
        if(day_number>weekdays.length)
        {
            System.out.println("Invalid");
        }
        else{
            for(i=0;i<weekdays.length;i++)
            {
                if(day_number==i+1)
                System.out.println(weekdays[i]);
            }
        }
    }
 
}