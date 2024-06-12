
package basicjava;
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
         Scanner input1=new Scanner(System.in);
       int id;
       float t;
       String title, price, description, category;
      
       System.out.println("Enter the value of id:");
       id=input.nextInt();
       System.out.println("id="+id);
        System.out.println("Enter the value of t:");
       t=input.nextFloat();
       System.out.println("t="+t);
       
       System.out.println("Enter the title:");
       title=input1.nextLine();
       System.out.println("title="+title);
       
       System.out.println("Enter the price:");
       price=input1.nextLine();
       System.out.println("price="+price);
       
       System.out.println("Enter the description:");
       description=input1.nextLine();
       System.out.println("description="+description);
       
       System.out.println("Enter the category:");
       category=input1.nextLine();
       System.out.println("category="+category);
       
    }
    
}
