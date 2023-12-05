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

public class CaclulateAreaTriangle {
		   public static void main(String[] args) {
		   	
			   Scanner scanner = new Scanner(System.in);
				
				System.out.println("enter side 1");
				double s1 = scanner.nextDouble();
				System.out.println("enter side 2");
				double s2 = scanner.nextDouble();
				System.out.println("enter side 3");
				double s3 = scanner.nextDouble();
				
				
				boolean valid = isValid(s1,s2,s3);
				if(isValid(s1, s2, s3) == false) {
				    System.out.println("Invalid Triangle");    
				}else{
				    System.out.println("The area is: " + calculating(s1, s2, s3));
				}
				
		   
		      
		   }
		
//calculating the area	
private static double calculating(double s1, double s2, double s3) {
	double area = (s1+s2+s3)/2.0d;
	double resArea = Math.sqrt(area* (area - s1) * (area - s2) * (area - s3));
	return resArea;

	}
//returning true or false boolean if legal
public static boolean isValid(double s1, double s2, double s3) {
	boolean isValid;
	return (s1 + s2 > s3 && s2+s3>s1 && s3+s1>s2);
	
	
	
}
}