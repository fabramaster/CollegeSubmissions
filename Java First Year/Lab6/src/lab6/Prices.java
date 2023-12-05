package lab6;

public class Prices {
	public static void main(String[] args) {
	double [] price = {2.45, 7.85, 1.35, 1.55, 4.05, 9.55, 4.55, 1.45, 7.85, 1.25, 5.55, 10.95, 8.55, 
			2.85, 11.05, 1.95, 5.05, 8.15, 10.55, 1.05};
	
	System.out.println("The sum of all prices is " + sumOf(price));
	lessThan5(price);
	System.out.println();
	System.out.println("The average price is " + averegeP(price));
	System.out.println("the prices that are above the average are ");
	moreThanA(price);
	
	
	}
	//less than 5 dollarydoos
	public static void lessThan5(double[] array) {
		double result = 0;

		System.out.println("the prices that are below $5 are ");
	for(int i = 0; i < array.length; i++) {
		
			if (array[i] < 5.0) {
				result = array[i];
				System.out.print(result + "  " );
			}
	}
	
	}
	//higher than average
	public static void moreThanA(double[] prices) {
		double average = 0;
		double result = 0;
		double sum = 0;
		for(double f : prices)
		{
			sum += f;
			average = sum / prices.length;
		}
		
		
		for(int i = 0; i < prices.length; i++) {
			
			if (prices[i] > average) {
				result = prices[i];
				System.out.print(result + "  " );
			}
			
		}
		
		
	}
	//average of all prices
	public static double averegeP(double[] array) {
		double average = 0;
		double sum = 0;
		for(double e : array)
		{
			sum += e;
			average = sum / array.length;
		}
		return average;
		
	}
	
	//sum of all prices
	 public static double sumOf(double[] array)
	    {
		 double index = 0;
		 for(double i : array)
			{

					index += i;
	
			}
			return index;
		}
	

	 
	 
	 
	 
	 
}
