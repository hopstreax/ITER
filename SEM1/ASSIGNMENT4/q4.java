package Assignment4;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=s.nextInt();
        System.out.println("Enter second number: ");
        int b=s.nextInt();
        while (a!=0)
        {
            if (a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
            if (a==b){
                System.out.println("gcd: "+a);
            }
        }
    }
    
}
