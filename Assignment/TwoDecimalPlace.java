
package Assignment;
import java.util.Scanner;
public class TwoDecimalPlace { 
public static void main(String args[])   
{  
  Scanner input=new Scanner(System.in);
    System.out.println("Enter a Double  Number: ");
    Double i;
    i=input.nextDouble();  
System.out.println("Double Number: " + i);      
System.out.printf("Double Number: %.2f", i);  
}  
} 

