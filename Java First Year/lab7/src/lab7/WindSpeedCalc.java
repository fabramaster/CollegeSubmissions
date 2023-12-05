package lab7;
import java.util.Scanner;

public class WindSpeedCalc {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter speed of wind in km/hr");
		double speed = scanner.nextDouble();
		
		Wind wind = new Wind(speed);
		
		System.out.printf("The wind speed is equivalent to  %.2f", wind.calculateKnots()," knots");
		System.out.printf ("\n The wind speed ranks around a "+ wind.calculateB() +" on the beaufort scale");
		System.out.printf("\n " + wind.analyzeWind(speed));
		
	}
	
	}

