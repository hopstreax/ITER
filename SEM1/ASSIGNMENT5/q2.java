package Assignment5;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=s.nextInt();
        int rev=0, a=n;
        while (a>0)
        {
            rev=rev*10+(a%10);
            a/=10;
        }
        System.out.println(rev);
        int c=0;
        for (int i=1; i<=n; i++){
            if (n%i==0){
                c++;
            }
        }
        int d=0;
        for (int j=1; j<=rev; j++){
            if (rev%j==0){
                d++;
            }
        }
        if (c==2 && d==2){
            System.out.print("Twisted prime number");
        }
        else{
            System.out.println("not a twisted prime");
        }
    }
    
}
