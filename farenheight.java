
package basicjava;

import java.util.Scanner;

public class farenheight {
    public static void main(String[] args)
    {
      Scanner input=new Scanner(System.in);
      double celc,faren;
      System.out.println("Enter celc value:");
      celc=input.nextDouble();
      faren=1.8*celc+32;
      System.out.print("Farenheight="+faren);
      
    }
}
