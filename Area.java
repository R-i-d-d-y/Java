
package basicjava;
import java.util.Scanner;
public class Area 
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      double base,height,radius,area;
      System.out.println("Enter the base:");
      base=input.nextDouble();
      System.out.println("base="+base);
      System.out.println("Enter the height:");
      height=input.nextDouble();
      System.out.println("height="+height);
      System.out.println("Enter the radius:");
      radius=input.nextDouble();
      System.out.println("radius="+radius);
      area=.5*base*height;
      System.out.println("Area of triangle"+area);
      area=base*base;
      System.out.println("Area of square is:"+area);
      area=base*height;
      System.out.println("Area of rectangle is :"+area);
      area=3.14*radius*radius;
      System.out.print("Area of circle is:"+area);
      
  }
}
