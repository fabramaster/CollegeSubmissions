package lab4;
/*
 * Alexander Ross cosc 111-003
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class CoinToss {
	public static void main(String[] args) {
		int trials = 0;
		int wins = 0;
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 0 for tails or 1 for heads, enter -1 to quit");
		int userInput = scanner.nextInt();
		
		while(userInput!= -1) {
			int flip = Math.random()< 0.5 ? 0: 1;
			System.out.println(flip);
			if ( flip == userInput ) {
				trials++;
				wins++;
				System.out.println("computer generated " + flip + " you win!");
				scanner.nextInt();
				
				
				
			}
			else if (flip !=userInput ) {
				trials++;
				System.out.println("computer genearted " + flip + " you lose");
				scanner.nextInt();
			}
		System.out.println("number of wins is " + wins + " out of total " + trials + " trials");
			
		}
	}
}
		
		
		



