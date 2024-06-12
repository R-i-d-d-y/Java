package Assignment;
import java.text.DecimalFormat;
import java.util.Scanner;
public class DispWithComma
{
    String number;
    String comma="";
   DispWithComma(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number : ");
        number=input.nextLine();
    }
    
    void alter(){
        int length=number.length();
        int i,j,len;
        len=length-3;
        if(length>3 && ((length%2)==1)){
            for(i=0,j=2;i<length;i++){
                if(i==j && i<=len){comma=comma+',';j=j+2;}
                comma=comma+number.charAt(i);
            }
        }
        else if(length>3 && ((length%2)==0)){
            for(i=0,j=1;i<length;i++){
                if(i==j && i<=len){comma=comma+',';j=j+2;}
                comma=comma+number.charAt(i);
            }
        }
        else{
            comma=comma+number;
        }
    }
 public static void main(String[] args)
 {
          DispWithComma object=new DispWithComma();
        object.alter();
        System.out.println("Number with comma : "+object.comma);
    }

}
    

