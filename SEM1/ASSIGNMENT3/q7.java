package Assignment3;
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Electricity used (in units): ");
        int a=s.nextInt();
        double bill=0;
        if (a<=50)
        { 
            bill=3*a;
            
        }
        else if (a >50 && a<=200)
        {
            bill=(50*3)+((a-50)*4.80);
            
        }
        else if (a>200 && a<=400)
        {
            bill=(50*3)+(150*4.80)+((a-50)*5.20);
            
        }
        else if (a>400)
        {
            bill=(50*3)+(150*4.80)+(200*5.20)+((a-400)*6.20);
            
        }
        System.out.println("your bill is " + bill);
        System.out.println("do you want to pay your bill online (y/n)?:");
        String pay = s.next();

        if (pay.equalsIgnoreCase("y")) {
            bill = bill - (bill * 0.03);
            System.out.println("Your final bill: " + bill);
        }
        else if (pay.equalsIgnoreCase("n")) {
            System.out.println("You have chosen not to pay your bill online.");

    }

    
}
}
