package basicjava;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int[] number=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
    for(int i=0;i<5;i++){
    number[i]=input.nextInt();
    }
    for(int i=0;i<5;i++){
    System.out.print(number[i]+" ");
    }
    }
    
}
