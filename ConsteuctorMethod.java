
package basicjava;
import java.util.Scanner;
class a{
    double height;
    double width;
    double depth;
    a(double x,double y,double z)
    {
      height=x;
      width=y;
      depth=z;
    }
    a(String s){
        System.out.println(s);
    }
    void print()
    {
        System.out.println("Volume is:");
        System.out.print(height*width*depth);
    }
    
}
public class ConsteuctorMethod {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       double a,b,c;
       System.out.println("Enter a:");
       a=input.nextDouble();
       System.out.println("Enter b:");
       b=input.nextDouble();
       System.out.println("Enter c:");
       c=input.nextDouble();
       a obj=new a(a,b,c);
       obj.print();
       a obj1=new a("hi ami pass hoisi constructor e..");
        
    }
 
}
