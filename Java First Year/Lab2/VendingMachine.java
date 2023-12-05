import java.util.Scanner;

public class VendingMachine {
	   
	 public static void main(String[] args) {
		 
		 int amount, originalAmount, quarters, dimes, nickels, pennies;//Deceleration of our variables
		Scanner scanner = new Scanner(System.in);//scanner
	  
		
	  System.out.println("Please enter the amount between 1c-99c");
	  	amount= scanner.nextInt();  
	  	originalAmount = amount;//just declares our amount in a different scanner
	  	quarters = amount / 25; //gets our amount
	  	amount = amount % 25;//yields remainder af
	  	dimes = amount / 10;
	  	amount = amount % 10;
	  	nickels = amount / 5;
	  	amount = amount % 5;
	  	pennies = amount / 1; // i know you said not to, but its very convenient
	  	amount = amount % 1;
	  	
	  	
	  	
	  	
	  	
	  	
	  	
	  System.out.println("the original amount is:" + originalAmount);
	  System.out.println(quarters + " quarters");
	  System.out.println(dimes + " dimes");
	  System.out.println(nickels + " nickels");
	  System.out.println(pennies + " pennies");
	  	
	  	
	  	
	  	
	  	
	  			scanner.close();
		} 
}
