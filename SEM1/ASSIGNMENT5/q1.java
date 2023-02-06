package Assignment5;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int count1=0, count2=0;
        System.out.print("Ente first number: ");
        int a =s.nextInt();
        System.out.print("Enter second number: ");
        int b=s.nextInt();
        for (int i=1; i<a; i++) {
            if (a%i==0){
                count1+=i;
            }
        }
        for (int i=1; i<b; i++) {
            if (b%i==0){
                count2+=i;
            }
        }
        if (count1==b && count2==a){
            System.out.print("Amicable number");
        }
        else{
            System.out.println("not an amicable number");
        }
    
}
}
