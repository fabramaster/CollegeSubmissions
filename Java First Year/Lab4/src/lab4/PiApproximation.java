package lab4;
/*
 * Alexander Ross cosc 111-003
 * 
 * 
 * 
 * 
 * 
 */
public class PiApproximation {
	public static void main(String[] args) {
		
		
		int value=-1;
		double piValue=0;
		for(int i=1; i<100000; i++) {
			value*=-1;
			
			piValue += value * 4./(2 * i-1);
			
			if (i%20000==0) {
				
				
				System.out.println(i + "  "+ piValue);
			}	
		}
	}
}
