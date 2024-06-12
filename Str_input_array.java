
package basicjava;
import java.util.Scanner;
class A{
    A(String[] s)
    { System.out.println(s.length);
      for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]+" ");
        }  
    }
}
public class Str_input_array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
        String[] arr=new String[5];
        System.out.println("Enter 5 strings:");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter "+ +(i+1) +" number string:");
            arr[i]=input.nextLine();
            
        }
       A obj=new A(arr); 
    }
}
