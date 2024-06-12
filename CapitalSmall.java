
package basicjava;
import java.util.Scanner;
public class CapitalSmall {
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      char ch;
      System.out.print("Enter a character:");
      ch=input.next().charAt(0);
      System.out.println("Your Entired character is:"+ch);
      if(Character.isLowerCase(ch))
      {
          System.out.println("Lowercase Character");
      }
     else 
      {
          System.out.println("Uppercase Character");
      }
      //if(ch>='A'&&ch<='Z')
      //System.out.println("Capital");
      //else if(ch>='a'&&ch<='z')
      //System.out.println("Small");
  }
}
