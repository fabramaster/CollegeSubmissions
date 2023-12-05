/* Alexander Ross
 * COSC 111 L05
 * 
 * 
 * 
 */






package lab3;
import java.util.Scanner;

public class IsDivisible {
	
	
	public static void main (String[]args) {
		
		int int1;
		int int2;
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("enter your first integer");
    	int1 = scanner.nextInt();
    	System.out.println("enter your second integer");
    	int2 = scanner.nextInt();
    	
    	if (int1 % int2 ==0) {
    		System.out.println("it is divisible by"+ int2);
    	}else {
    			System.out.println("it is not divisible by " + int2);
    		}
    		
    	scanner.close();
		
	}

}
