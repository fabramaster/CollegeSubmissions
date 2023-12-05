package lab5;
import java.util.Scanner;
//exploring methods

public class Exercise1 {
	
	public static void main(String []args){
		String name = "bob";
		int items = 2;
		double price = 9.9;
		double tax = 12;
		
		
		//Exercise1 object = new Exercise1();
		greeting(name);
		System.out.printf("The cost is %.2f", calculateCost(items,price,tax));
		
		
	}
	public static void greeting(String firstname) {
	System.out.println("customer " + firstname + " Welcome to the store");
	
}
	public static double calculateCost(int numOfItems, double price, double tax) {
		double cost = numOfItems * price * (1 + tax * 0.01);
		return cost;
		
	}
}
