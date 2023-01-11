import java.util.Scanner;
public class Q_6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter time in seconds: ");
        final double g=32.174;
        double time, distance;
        time=s.nextDouble();
        distance=(1.0/2.0)*g*time*time;
        System.out.println("Distance: " + distance);
    }
    
}
