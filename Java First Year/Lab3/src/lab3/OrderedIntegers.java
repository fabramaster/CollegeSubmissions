/* Alexander Ross
 * COSC 111 L05
 * 
 * 
 * 
 */



package lab3;
import java.util.Arrays;
import java.util.Scanner;

public class OrderedIntegers {
	
	
	public static void main (String[]args) {
		
		int int1;
		int int2;
		int int3;
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		//user inputs
		System.out.println("enter your first integer");
    	int1 = scanner.nextInt();
    	System.out.println("enter your second integer");
    	int2 = scanner.nextInt();
    	System.out.println("enter your third integer");
    	int3 = scanner.nextInt();
    	
    	
    	
    	//much nicer output than to user Array.sort, will output highest to least.
    	if (int1 >= int2 && int2 >= int3) {
    		System.out.println("The numbers in decreasing order are ");
    		System.out.println(int1);
    		System.out.println(int2);
    				System.out.println(int3);
    	
		} 
    	else if (int1 >= int2 && int2 <= int3 && int3 >= int1) {
    		System.out.println("The numbers in decreasing order are ");
    		System.out.println(int3);
    		System.out.println(int1);
    				System.out.println(int2);
    	
		}
    	else if (int1 <= int2 && int2 >= int3 && int1 >= int3) {
    		System.out.println("The numbers in decreasing order are ");
    		System.out.println(int2);
    		System.out.println(int1);
    				System.out.println(int3);
		}
    	else if (int1 <= int2 && int2 <= int3) {
    		System.out.println("The numbers in decreasing order are ");
    		System.out.println(int3);
    		System.out.println(int2);
    				System.out.println(int1);
    		
		}
    	
    	
	}
}