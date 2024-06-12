package Assignment;
import java.util.Scanner;
public class InputByOneCharacter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char[] ch;
        ch=new char[5];
        int i;
        for(i=0;i<5;i++)
        {
          System.out.println("Enter a character: ");  
          ch[i]=input.next().charAt(0);
          System.out.println("Your Entired Character is: "+ch[i]);
        }  
    }
 
}
