
package basicjava;

public class IncrementDecrement {
    public static void main(String[] args)
    {
        int x=10,y;
        y=++x+x++;//11
        System.out.println("Y="+y);
        y=x+++x++;//11
          System.out.println("Y="+y);
          y=--x;//11
            System.out.println("Y="+y);
            y=x--;//11
              System.out.println("Y="+y);
    }
}
