package Assignment3;
import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter your mark : ");
int n;
n=s.nextInt();
switch (n/10)
{
case 10:
case 9 : System.out.println(" Grade is : O ");
break;
case 8 : System.out.println(" Grade is : A ");
break;
case 7 : System.out.println(" Grade is : B ");
break;
case 6 : System.out.println(" Grade is : C ");
break;
case 5 : System.out.println(" Grade is : D ");
break;
case 4 : System.out.println(" Grade is : E ");
break;
case 3 : System.out.println(" Grade is : F ");
break;
case 2 : System.out.println(" Grade is : g ");
break;
    }
    
}
}
