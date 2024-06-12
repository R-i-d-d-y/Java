
package basicjava;
import java.util.Scanner;
public class celcious {
    
     public static void main(String[] args)
    {
     Scanner input=new Scanner(System.in);
      double celc,faren;
      System.out.println("Enter faren value:");
      faren=input.nextDouble();
      celc=.5556*(faren-32);
      System.out.print("Celcious="+celc);
      
    }
}
