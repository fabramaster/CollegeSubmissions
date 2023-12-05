/* Alexander Ross
 * COSC 111 L05
 * 
 * 
 * 
 */





package lab3;
import java.util.Scanner;
public class Quadratic {
	public static void main (String[]args){
		Scanner scanner = new Scanner(System.in);
		double A;
		double B;
		double C;
		double D;
		double X1;
		double X2;
		
		//user input 
		System.out.println("enter A: ");
		A = scanner.nextDouble();
    	System.out.println("enter B: ");
    	B = scanner.nextDouble();
    	System.out.println("enter C: ");
    	C = scanner.nextDouble();
		
		//calculating (b^2 - 4*A*C)
    	  D = B * B - 4 * A * C;
    	  
    	  
    	  //getting both roots
    	  if (D >= 0) {
    		 X1 =  (-B + Math.sqrt(D)) / (2 * A);
    		 X2 =  (-B - Math.sqrt(D)) / (2 * A);
    		 System.out.println("root 1 " + X1);
    		 System.out.println("root 2 " + X2);
    		  
    		  
    		  
    	  }else {
    		  
    		  System.out.println("There is no real roots");
    	  }
    	  scanner.close();
		
		
	} 
	}
