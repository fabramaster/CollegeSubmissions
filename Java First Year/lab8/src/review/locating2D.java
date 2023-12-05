package review;

public class locating2D {
	 public static void main(String[] args)
	    {
		 
		 		double [][] array = 
		 			{
		 					{1,2,3},{4,5,6},{7,8,9}
		 			};
		 		int [] location = locateLargest(array);
				 System.out.println(location[0] + " why  " + location[1]);
	    }
	 
	 public static int[] locateLargest(double[][] array) {
		
		 int[] largestlocation = new int [2];
		 //assign element value
		 largestlocation[0] =0;
		 largestlocation[1] =0;
		 //create variable to hold the largest element
		 double largest = array[0][0];
		 for (int i=0; i < array.length;i++)
		 {
			 for(int j=0; j < array[i].length;j++) {
				 if (array[i][j] > largest ) {
					 largest = array[i][j];
					 largestlocation[0] = i; largestlocation[1]=j;
				 }
			 }
		 }
		 return largestlocation;
	 }
}
	

