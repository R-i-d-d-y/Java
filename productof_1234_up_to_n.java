
package basicjava;

public class productof_1234_up_to_n 
{
     public static void main(String[] args) 
    {
       java.util.Scanner input=new java.util.Scanner(System.in); 
       int n,product=1,i;
       System.out.print("Enter last number:");
       n=input.nextInt();
       for(i=1;i<=n;i++)
       {
           product=product*i;
       }
       System.out.println("product="+product);
    }
}
