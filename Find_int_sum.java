
package basicjava;
import java.util.Scanner;
public class Find_int_sum {
    public static void main(String[] args) {
     
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string:");
        int sum=0;
        while(input.hasNext()){
            int a=input.nextInt();
            
            sum=sum+a;
        }
        System.out.println(sum);
    }
}
