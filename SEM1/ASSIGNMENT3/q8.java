package Assignment3;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter x coordinates:");
        double x=s.nextDouble();
        System.out.println("Enter y coordinates:");
        double y=s.nextDouble();
        System.out.println("("+x+","+y+") is on the");
        if (x>0 && y>0)
        {
            System.out.println("first quadrants");
        }
        else if (x<0 && y>0)
        {
            System.out.println("second quadrants");
        }
        else if (x<0 && y<0)
        {
            System.out.println("third quadrants");
        }
        else if (x>0 && y<0)
        {
            System.out.println("fourth quadrants");
        }
        else if (x!=0 && y==0)
        {
            System.out.println("x axis");
        }
        else if (x==0 && y!=0)
        {
            System.out.println("y axis");
        }
        else 
        {
            System.out.println("origin");
        }
    }
}
