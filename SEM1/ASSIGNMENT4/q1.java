package Assignment4;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,sum=0;
        System.out.print("Enter first number : ");
        a=sc.nextInt();
        System.out.print("Enter second number : ");
        b=sc.nextInt();
        System.out.print("Enter third number : ");
        c=sc.nextInt();
        for(int i=a;i<=b;i+=c)
        {
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println(" \n"+"The sum of number displayed is "+sum);
    }
    
}
