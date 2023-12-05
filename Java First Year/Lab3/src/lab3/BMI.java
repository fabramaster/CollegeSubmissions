/* Alexander Ross
 * COSC 111 L05
 * 
 * 
 * 
 */





package lab3;
import java.util.Scanner;

public class BMI
{ 

    public static void main(String[] args) 
    
    { 
    	int pounds;
    	int heightF;
    	int heightI;
    	double meters;
    	double kg;
    	double BMI;
    	
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("enter your weight in burger units");
    	pounds= scanner.nextInt();
     	System.out.println("Enter your height in feet (ex input 5 if you are 5'2");
    	heightF= scanner.nextInt();
    	System.out.println("Enter your height in inches (ex input 2 if you are 5'2");
    	heightI= scanner.nextInt();
    	
    	meters = ((heightI * 0.0254) + (0.3048 * heightF) );
    	kg = (pounds * 0.453592);
    	BMI = (kg / (meters * meters));
    	
    	if ( BMI <= 18.5 ) {
    		System.out.println("eat some more food, you are undeweight");
    	}
    	else if ( (BMI >= 18.5) && (BMI <= 25)){
    		System.out.println("you are normal weight");
    	}
    	else if ( (BMI >= 25)&&(BMI <= 30) ){
    		System.out.println("eat some less food you are overweight");

    	}
    	else if (BMI <= 30 ){
    		System.out.println("eat a lot less food, you are obese");

    	}
    
    	System.out.printf("your BMI is %.1f", + BMI);
    	scanner.close();
    	
    }
}