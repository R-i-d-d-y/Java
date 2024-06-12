
package basicjava;

public class Bitwise {
    public static void main(String[] args)
    {
    
       int a=32,b=12,c;
       c=a&b;
       System.out.print("a&b="+c+"\n");
       c=a|b;
       System.out.print("a|b="+c+"\n");
       c=a^b;
       System.out.print("a^b="+c+"\n");
       c=a>>3;
       System.out.print("a>>3="+c+"\n");
       c=a<<3;
       System.out.print("a<<3="+c+"\n");
    }
}
