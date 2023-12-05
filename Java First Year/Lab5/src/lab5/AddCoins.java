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

public class AddCoins {


public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter quarters ");
	double quarters = scanner.nextDouble();
	System.out.println("enter Dimes ");
	double dimes = scanner.nextInt();
	System.out.println("enter Nickles ");
	double nickles = scanner.nextDouble();
	System.out.println("enter pennies ");
	double pennies = scanner.nextDouble();
	
	
	System.out.printf("the total dollar amount is %.2f", calculating(quarters, dimes, nickles, pennies));
	
}
private static double calculating(double quarters,double dimes,double nickles,double pennies) {
	
	return (quarters * 0.25) + (dimes * .10) + (nickles * .05) + (pennies * .01) ;
	
	
	}

}