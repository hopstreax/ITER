package Assignment3;
import java.util.Scanner;
public class h4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int a = sc.nextInt();

        System.out.println("Is " +a+" divisible by 5 and 6 ? " +((a%5==0) && (a%6==0)));
        System.out.println("Is " +a+" divisible by 5 or 6 ? " +((a%5==0) || (a%6==0)));
        System.out.println("Is " +a+" divisible by 5 or 6, but not both? " +((a%5==0) ^ (a%6==0)));
    }
}
