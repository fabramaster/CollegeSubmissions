package review;

import java.util.Random;
import java.util.Scanner;

public class TwentyOne {
	 public static void main(String[] args)
	    {
		 Scanner input = new Scanner(System.in);
		 Random rand = new Random();
		int random = rand.nextInt(10 - 2)+ 1;
		int sum1 = random;
		random = rand.nextInt(10 - 2)+ 1;
			int sum2 = random;
		 int sum = sum1 + sum2;
		 System.out.println("you have " + sum);
		
		 if (18 < sum && sum < 21) {
			 
			 System.out.println("you win!");
		 }else if(sum < 18) {
			 
			 System.out.println("would you like 1 or 2 additional numbers?");
			 int num = input.nextInt();
			 if (num == 1) {
				 
				 //roll once again
				 random = rand.nextInt(10 - 2)+ 1;
				 sum = sum + random;
				 System.out.println("you have " + sum);
			 }else if (num == 2){
				 
				 //roll twice 
				
				 random = rand.nextInt(10 - 2)+ 1;
				 sum = sum + random;
				 random = rand.nextInt(10 - 2)+ 1;
				 sum = sum + random;
				 System.out.println("you have " + sum);
			 } }
			 else  {
				 System.out.println("you lose ");
			 }
		 
		 

	    }
}
