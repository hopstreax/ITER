package Assignment3;
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers a,b,c:");
        int a, b, c, max, min, mid;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        max=(int)Math.max(Math.max(a,b),c);
        min=(int)Math.min(Math.min(a,b),c);
        mid=a+b+c-max-min;
        System.out.println("Largest no.:"+max);
        System.out.println("2nd Largest no.:"+mid);
    }
}
    

