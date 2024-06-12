
package basicjava;

public class ProductOfSquare 
{
     public static void main(String[] args) 
    {
       java.util.Scanner input=new java.util.Scanner(System.in); 
       int n,product=1,i;
       System.out.print("Enter last number:");
       n=input.nextInt();
       for(i=1;i<=n;i++)
       {
           product=product*i*i;
       }
       System.out.println("product="+product);
    }
}
