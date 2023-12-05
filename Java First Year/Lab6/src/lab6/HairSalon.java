package lab6;

import java.util.Scanner;

public class HairSalon {
	public static void main(String[] args) {
		
		
	 String[] service = {"Cut", "Shampoo", "Manicure", "Style", "Permanent", "Trim"};
     double[] price = {25.50, 8.00, 23.50, 48.00, 22.50, 12.00};
     double[] time = {20, 15, 35, 55, 40, 10};
     
     //User Input Section
 	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter the service you would like " );
	String UserI = scanner.next();
	System.out.println(service[findService(service,UserI)]);
	System.out.println("$" + price[findService(service,UserI)]);
	System.out.println(time[findService(service,UserI)] + " min");
	
	//Presets 
     int indexoftheMostTime = mostTime(time);
     System.out.println("service which requires the most time is " + service[indexoftheMostTime] +
      " requires " + time[indexoftheMostTime] + " min");
     
     int indexoftheLeastTime = leastTime(time);
     System.out.println("service which requires the least time is " + service[indexoftheLeastTime] +
      " requires " + time[indexoftheLeastTime] + " min");
     
     double indexoftheAverageP = averageValue(price);
     System.out.println("average price is $" + price[(int) indexoftheAverageP]);
     
     double indexoftheAverageT = averageValue(time);
     System.out.println("average time is " + time[(int) indexoftheAverageT] + " min");
     
	}
	//returns the index of the array element which has the maximum time
	 public static int mostTime(double[] time)
	    {
	int index = 0;
	double max = time[0];
	for(int i = 0; i <time.length;i++) {
		if (max < time[i])
		{
			max = time[i];
			index = 1;
		}
	}
	//write the code to find the largest element
	       return index; // return the index of largest value of the array
	    }
	    
	//returns the index of the array element which has the minimum time
	    public static int leastTime(double[] time)
	    {
	    	int index = 0;
	    	double min = time[0];
	    	for(int i = 0; i <time.length;i++) {
	    		if (min > time[i])
	    		{
	    			min = time[i];
	    			index = 3;
	    		}
	    	}
	    	//write the code to find the largest element
	    	       return index; // return the index of largest value of the array
	    	    }
	//calculate the average of the array values
	    public static double averageValue(double[] array)
	    {
	    	
	       double average = 0;
	       double sum = 0;
	      
			for(double element2: array) 
				sum += element2;
			//average
			double averege = sum / array.length;
	       return average;
}
	    public static int findService(String[] array,String serviceFind) {
			int index = -1;
			for(int i = 0; i < array.length;i++)
			{
				if(serviceFind.equalsIgnoreCase(array[i]))
					index = i;
	
			}
			return index;
	    	
	    	
	    	
	    }
	    }

