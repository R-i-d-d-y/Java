package basicjava;
  class a{
     double height=10;
     double width=10;
     double depth=10;
     int x;
     int y;
     int z;
    void vol()
     {
         System.out.println("Volume1 is:");
         System.out.println(width*height*depth);
     }
    double vol3()
    {
       return height*width*depth; 
    }
   void vol4(int p,double q,double r)
    {
        x=p;
      System.out.println("Vol4 is:");
      System.out.println(x*q*r);
    }
 }

public class Method {
    public static void main(String[] args) {
        a obj=new a();
        obj.vol();
        obj.x=5;
        obj.y=5;
        obj.z=5;
         System.out.println("Volume2 is:");
         System.out.println(obj.x*obj.y*obj.z);
        double d;
         d=obj.vol3();
         System.out.println("Vol3 is:");
         System.out.println(d);
         a obj2=new a();
         obj2.vol4(4, 4, 4);
       
        } 
}
