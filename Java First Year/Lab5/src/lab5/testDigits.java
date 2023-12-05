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

public class testDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  System.out.println("insert a whole number here");
			double userNum = scanner.nextInt();
			//if statements
        if (allDigitsOdd((int) userNum)) {
            System.out.printf((int)userNum + "%n all the digits are odd");
        } else {
            System.out.printf((int)userNum + "%n all the digits are not odd");
        }
	}
	  
	
	  public static boolean allDigitsOdd(int num) {
	        while (num > 0) {
	            int value = num % 10;
	            num = num / 10;
	            //checking false
	            if (value % 2 == 0) 
	            {   
	            return false;
	            }
	        }
	        //return true if not false
	       return true;
	    }
	}