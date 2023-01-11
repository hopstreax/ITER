import java.util.Scanner;
public class Q_4 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number between 0 to 1000: ");
        int n=s.nextInt();
        int first=n%10;
        int remaining=n/10;
        int second=remaining%10;
        remaining= remaining/10;
        int third=remaining%10;
        remaining=remaining/10;
        int fourth=remaining%10;
        int sum=first+second+third+ fourth;
        System.out.println("Sum of the digits:"+sum);
    }
    
}
