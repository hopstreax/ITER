package Assignment3;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class q3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=s.nextInt();
        System.out.println("Enter second number: ");
        int b=s.nextInt();
        System.out.println("Enter third number: ");
        int c=s.nextInt();
        if (a<=b && b<=c)
        {
            System.out.println("increasing");
        } 
        else if (a>=b && b>=c)
        {
            System.out.println("decreasing");
        }
        else
        System.out.println("neitehr increasing nor decreasing");
    }
    
}
