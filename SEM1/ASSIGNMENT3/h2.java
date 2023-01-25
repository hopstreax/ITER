package Assignment3;
import java.util.Scanner;
public class h2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Today's day: ");
        int date = sc.nextInt();
        System.out.print("Enter the number of days elapsed since today :");
        int elapsed = sc.nextInt();
        int futureDay = (date + elapsed)%7;

        String day = "";

        switch (date){
            case 0 : day = "Sunday";
                    break;
            case 1 : day = "Monday";
                    break;
            case 2 : day = "Tuesday";
                    break;
            case 3 : day = "Wednesday";
                    break;
            case 4 : day = "Thursday";
                    break;
            case 5 : day = "Friday";
                    break;
            case 6 : day = "Saturday";
                    break;
        }

        if (futureDay == 0)
            System.out.println("Today is " + day + " and future day is Sunday");
        else if (futureDay == 1)
            System.out.println("Today is " + day + " and future day is Monday");
        else if (futureDay == 2)
            System.out.println("Today is " + day + " and future day is Tuesday");
        else if (futureDay == 3)
            System.out.println("Today is " + day + " and future day is Wednesday");
        else if (futureDay == 4)
            System.out.println("Today is " + day + " and future day is Thursday");
        else if (futureDay == 5)
            System.out.println("Today is " + day + " and future day is Friday");
        else if (futureDay == 6)
            System.out.println("Today is " + day + " and future day is Saturday");

    
    }
    
}
