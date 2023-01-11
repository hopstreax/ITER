import java.util.Scanner;
public class Q_3 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter basic salary:");
        double basic;
        basic=s.nextDouble();
        double da, hra, Gross;
        da=(40.0/100.0)*basic;
        hra=(20.0/100.0)*basic;
        Gross=basic+da+hra;
        System.out.println("DA: "+da);
        System.out.println("HRA: "+hra);
        System.out.println("Gross: "+Gross);
    }
    
}
