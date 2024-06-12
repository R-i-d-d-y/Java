
package basicjava;

public class Continue 
{
    public static void main(String[] args) 
    {
       int i;
        for(i=1;i<=100;i++)
        {
            if(i==10)
            {
                continue;  
            }
          System.out.println(i);  
        }
    }
}
