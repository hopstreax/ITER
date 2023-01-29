package Assignment4;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter your number :");
        n = sc.nextInt();
        int sum= 0;
        while(n>0)
        {
            int a=n % 10;
            sum+=a;
            n/=10;
        }
        if(sum%9==0)
        {
            System.out.println(" The number is divisible by 9");
        }
        else
        {
            System.out.println(" The number is not divisible by 9 ");
        }
    }
}
