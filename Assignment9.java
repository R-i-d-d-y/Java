
package basicjava;

import java.util.Scanner;
public class Assignment9 {
  public static void main(String[] args ) 
  {
     Scanner input=new Scanner(System.in); 
     int option;
     System.out.print("Enter a option :");
     option=input.nextInt();
     switch(option)
     {
         case 1:
             System.out.print("Your selected language is Bangla\n");
              break;
         case 2:
             System.out.print("Your selected language is Urdu\n");
              break;
         case 3:
             System.out.print("Your selected language is Hindi\n");
              break;
         default:
             System.out.print("Your selected language is English\n");
              break;
     }
  }
  }

