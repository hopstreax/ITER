package Assignment3;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner s=new Scanner("System.in");
        System.out.println("Enter guess:");
        int a=s.nextInt();
        int d=(int)Math.random()*(9-1)+1;
        System.out.println("Computer guess:"+d);
        if (a==d) 
        {
            System.out.println("correct guess");
        }
        else if (a==d+1 || a==d-1) 
        {
            System.out.println("Almost got it");
        }
        else 
        System.out.println("Wrong guess");
    }
}    

