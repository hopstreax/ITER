import java.util.Scanner;
public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Temperature in Degree Farenheit");
double farenheit;
farenheit=s.nextDouble();
double celsius;
celsius=(farenheit-32)*(5.0/9.0);
System.out.println("Temperature in Degree Celcius"+celsius);
	}

}