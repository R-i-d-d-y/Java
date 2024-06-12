
package basicjava;
import java.util.Scanner;
public class String_manipulation {
    Scanner input=new Scanner(System.in);
    String s;
    String[] tokens;
    public String_manipulation(){
        s=input.nextLine();
        tokens=s.split(" ");
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println(tokens[1]);
        
        
        for(String token:tokens)
        {
            System.out.println(token);
        }
        
        
        char arr[];
        arr=s.toCharArray();
        for(char c:arr)
        {
            System.out.println(c);
        }
        
        
    System.out.println("Enter S1:");
    String s1=input.next();
    System.out.println("Enter S2:");
    String s2=input.next();
    if(s1.equals(s2)){
    System.out.println(s1+" and "+s2+" are Equal");
    }
    else{
        System.out.println(s1+" and "+s2+" are not Equal");
    }
    
    String s3;
    s3=s1+ s2;
    System.out.println("Concatation of String are:"+s3);
      System.out.println(s1+" "+s2);
    }
    
    
    void printoutput()
    {
          System.out.println("Your entired line is:"+s);
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String_manipulation obj=new String_manipulation();
        obj.printoutput();
    }
}
