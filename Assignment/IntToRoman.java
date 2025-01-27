
package Assignment;
import java.util.Scanner;
public class IntToRoman {
    
public static void intToRoman(int num)   
{  
System.out.println(" Your Entired Integer Number is: " + num);  
int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
StringBuilder roman = new StringBuilder();  
for(int i=0;i<values.length;i++)   
{  
while(num >= values[i])   
{  
num = num - values[i];  
roman.append(romanLetters[i]);  
}  
}  
System.out.println("Integer to Corresponding Roman Numerals is: " + roman.toString());  
}  
public static void main(String args[])   
{  
    Scanner input=new Scanner(System.in);
    System.out.println("Enter an Integer Number: ");
    int i;
    i=input.nextInt();
    intToRoman(i);   
}  
} 
