package Assignment3;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter year");
        int a=s.nextInt();
        if (a%4==0)
        {
            System.out.println("It is a leap year");
        }
        else
        System.out.println("It is not a leap year");
    }

    
}
