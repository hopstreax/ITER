package Assignment3;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Electricity used (in units): ");
        int a=s.nextInt();
        if (a<=50)
        { 
            double b=3*a;
            System.out.println("your bill:"+b);
        }
        else if (a>200 && a<=400)
        {
            double c=4.80*a;
            System.out.println("your bill:"+c);
        }
        else if (a>400)
        {
            double d=6.20*a;
            System.out.println("your bill:"+d);
        }
    

    }
    
}
