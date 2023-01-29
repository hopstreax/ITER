package Assignment4;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=s.nextInt();
        double sum=0;
        double count=0;
        do{
            int b=(int)(Math.random()*a)+1;
        System.out.println("Random number generarted: "+b);
        sum+=b;
        count++;
        } while(count<=a);
        double avg=sum/a;
        System.out.println("Average number"+avg);
    }
    
}
