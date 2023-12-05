import java.util.Scanner;

public class Averege {  
 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
  
			int num1, num2, num3;
  System.out.println("Please enter the first #");
  	num1 = scanner.nextInt();
  System.out.println("Please enter the Second #");	
  	num2 = scanner.nextInt();
  System.out.println("Please enter the third #");
  	num3 = scanner.nextInt(); 
  double threebby = 3 ;//Deceleration for our division operand, allows for double division.
  double averege = (num1 + num2 + num3); //our addition 
  System.out.println("The average of the three numbers is: " + averege/threebby);  //divides straight inside the output 
  			scanner.close();
	}  
}