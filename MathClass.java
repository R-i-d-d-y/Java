
package basicjava;

public class MathClass {
    public static void main(String[] args)
    {
        int x=2,y=3;
        int c=-19;
        int max=Math.max(x,y);
        System.out.println("Maximum is:"+max);
      
        System.out.println("Minimum is:"+Math.min(x,y));
        int absolute;
        absolute=Math.abs(c);
        System.out.println("Absolute="+absolute);
        double power=Math.pow(x,y);
        System.out.println("Power of x,y is:"+power);
        int round=Math.round(8.66f);//8.66 dile in ..ar float bujhate pore ekta f dite hoy
        System.out.println("Round of 8.66f is:"+round);
        double pi=Math.PI;
        System.out.printf("The value of pi is:%.3f",pi);
        
    }
    
}

