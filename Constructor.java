package basicjava;
class a
{ 
double height;
double width;
double depth;
a(double x,double y,double z)
{ height=x;
 width=y;
 depth=z;
 System.out.print("volume is:");
  System.out.println(height*width*depth);  
}
a(double height,double width)
{
   this.height=height;
   this.width=width;
}   
}
public class Constructor {
    public static void main(String[] args)
    {
        a obj=new a(5,5,5);
        a obj2=new a(10,20);
        System.out.print("Area is:");
        System.out.println(obj2.height*obj2.width);
    }
}
