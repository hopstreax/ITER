package Assignment3;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter amount water drank(in ml): ");
        int a=s.nextInt();
        if (a>=5000)
        {
            System.out.println("YES, Alice is following doctor's orders");
        }
        else{
            System.out.println("NO, Alice is not following doctor's orders");
        }
    }
    
}
