import java.util.Scanner;
public class Q_5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius");
        double r, SA, Vol;
        r=s.nextDouble();
        SA=3.0*Math.PI*r*r;
        Vol=(2.0/3.0)*Math.PI*r*r*r;
        System.out.println("Surface Area: " +SA);
        System.out.println("Volume: "+Vol);
    }
}
