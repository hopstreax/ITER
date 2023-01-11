import java.util.Scanner;
public class Q_2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter distance between two cities:");
        double distance;
        distance=s.nextDouble();
        double meter;
        meter=distance*1000;
        double feet;
        feet=distance*3280;
        double inch;
        inch=distance*39370;
        double cm;
        cm=distance*10000;
        System.out.println("distance in meter:"+meter);
        System.out.println("distance in feet:"+feet);
        System.out.println("distance in inch:"+inch);
        System.out.println("distance in cm:"+cm);
    }

}

