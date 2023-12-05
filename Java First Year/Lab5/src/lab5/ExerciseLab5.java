package lab5;
/*
 * Alexander Ross cosc 111-003
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class ExerciseLab5 {
	
	public static void main(String[]args) {
		
		System.out.println("Ceclsuis " + " Fahrenheit");
		for (int i = 40; i >= 30; i--) {
			double C = i;
			double F = convertToCelsius(C);
			System.out.println(F + "        " + C);
			
		}
		System.out.println("");
		System.out.println("Fahrenheit " + " Celcuis");
		for (int i = 49; i >= -30; i--) {
			double F = i;
			double C = convertToFahrenheit(F);
			System.out.println(C + "        " + F);
			
		}
		
		
	
		
	
	}
	
	public static double convertToFahrenheit(double celsius)
	{
		double F = celsius * 9./5 + 32;
		return F;
	}
	public static double convertToCelsius(double Fahrenheit)
	{
		double c = 5. / 9 * (Fahrenheit - 32);
		return c ;
	}
	
}
