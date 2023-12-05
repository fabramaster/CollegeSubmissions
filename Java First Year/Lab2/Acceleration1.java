import java.util.Scanner;

public class Acceleration1
{ 

    public static void main(String[] args) 
    
    { 
    	Scanner scanner = new Scanner(System.in);
    	
    	double Massa;
    	int Massb;
    	double Raduis;
    	double Gravity = Math.pow(6.674 , -11);
    	
        
       
        
        
        
        
    	System.out.println("Enter the mass of the planet in kilograms");
      	Massa= scanner.nextDouble();
      	System.out.println("Enter the exponent");
      	Massb= scanner.nextInt();
      	
      	System.out.println("Enter the raduis of the planet in km");
      	Raduis = scanner.nextDouble();
      	
      	
      	double Mass = Math.pow(Massa , Massb);
      	double Raduis1 = Math.pow(Raduis,2);
         double T2_chan = (Gravity*Mass/ (Raduis1));
      	
      	System.out.println(T2_chan);//i cannot get the right output, i tried for a long time. I apologize
      	
        
        
    } 
}