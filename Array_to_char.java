
package basicjava;
import java.util.Scanner;
class A{
    A(char[] s){
    for(char c:s)
        {
            System.out.println(c);
        }
        
        for(int i=0;i<s.length;i++)
        {
            System.out.println("Character at " +i+"position is:"+s[i]);
        }
}
}
public class Array_to_char {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String str;
        System.out.println("Enter a string:");
        str=input.nextLine();
        int s;
        s=str.length();
        System.out.println("Your entired string is:"+s);
        char[] arr=str.toCharArray();
        A ob=new A(arr);
        System.out.println("Length is:"+arr.length);
        
    }
}
