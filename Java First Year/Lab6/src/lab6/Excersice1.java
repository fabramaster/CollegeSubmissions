package lab6;
//exploring arrays 
public class Excersice1 {

	
	public static void main(String[] args) {
		final int NUM_STUDENTS = 10;
		final double MAX_HEIGHT = 200.;
		final double MIN_HEIGHT = 155.;
		double[] heights = new double[NUM_STUDENTS];
		for(int i = 0; i < heights.length; i++) {
			
			heights[i] = Math.random() * (MAX_HEIGHT - MIN_HEIGHT + 1) + MIN_HEIGHT;
			
			System.out.printf("%.1f, ",heights[i]);
	}
		//formatting
		System.out.println();
		System.out.println("_______________________________________________________________");
		//at array position -1 set as ###
		heights[heights.length - 1] = 175.5;
		//enhanced for loops
		for(double element:heights) 
			System.out.printf("%.1f, ",element);
		System.out.println();
		System.out.println("__________________________________________________________");
		//add #1 and #2 together
		System.out.print(heights[0] + heights[1]);
		//display the sum of all things
		double sum = 0;
		for(double element2: heights) 
			sum += element2;
		System.out.printf(" the sum of all added",sum);
		
		System.out.println();
		System.out.println("__________________________________________________________");
		//calculating average
		double averege = sum / heights.length;
		
		System.out.print(averege);
		System.out.println();
		System.out.println("__________________________________________________________");
		//finding min
		
		double min = heights[0];
		for(int i = 0; i < heights.length; i++) {
		if(min > heights[i])
			min = heights[i];
			
		}
		System.out.println("it is "+ min);
		System.out.println();
		System.out.println("__________________________________________________________");
		
		
		
		double[]heights1 = {175.8, 181.0, 167.5, 172.5, 192.0, 185.0, 183.0, 178.5, 188.7, 188.2};
		
		int randomIndex = (int)(Math.random() * heights1.length);
				System.out.printf("the element at the index %d is %.1f,", randomIndex, heights1[randomIndex]);
		
		
		}
		
	}

