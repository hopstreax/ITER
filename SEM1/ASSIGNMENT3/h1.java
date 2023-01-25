package Assignment3;
import java.util.Scanner;
public class h1 {
    public static void main(String[] args){
        int r1 = (int)(3 * Math.random()) ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Scissor (0) , Rock (1) , paper (2) :");
        int a = sc.nextInt();



        if (r1 == 0){
            if (a == 0)
            System.out.println("The Computer is Scissor . You are Scissor too . It is a draw");
            else if (a == 1)
            System.out.println("The Computer is Scissor . You are rock . You won");
            else if (a == 2)
            System.out.println("The Computer is Scissor . You are paper . You lose");
            else 
            System.out.println("Please input instructed values only");
        }
        else if (r1 == 1){
            if (a == 0)
            System.out.println("The Computer is rock . You are scissor . You lose");
            else if (a == 1)
            System.out.println("The Computer is rock . You are rock too . It is a draw");
            else if (a == 2)
            System.out.println("The Computer is rock . You are paper . You won");
            else 
            System.out.println("Please input instructed values only");
        }
        else if (r1 == 2){
            if (a == 0)
            System.out.println("The Computer is paper . You are scissor . You won");
            else if (a == 1)
            System.out.println("The Computer is paper . You are rock  . You lose");
            else if (a == 2)
            System.out.println("The Computer is paper . You are paper . It is a draw");
            else 
            System.out.println("Please input instructed values only");
        }

    }
    
    
}
