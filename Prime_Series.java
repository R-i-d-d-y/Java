
package basicjava;
import java.util.Scanner;
public class Prime_Series {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m,n,count=0,i,j,total=0;
        System.out.print("Enter initial number:");
        m=input.nextInt();
        System.out.print("Enter last number:");
        n=input.nextInt();
        for(i=m;i<=n;i++)
        {
           for(j=2;j<i-1;j++)
           {
               if(i%j==0)
               {
                   count++;
                   break;
               }
           }
           if(count==0)
           {
               System.out.println(i);
               total++;
           }
           count=0;
        }
        System.out.println("Total prime number ="+total);
        
    }
}
