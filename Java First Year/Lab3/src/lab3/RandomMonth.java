/* Alexander Ross
 * COSC 111 L05
 * 
 * 
 * 
 */






package lab3;



public class RandomMonth {

	public static void main (String[]args) {
		
		int month =(int) (Math.random()*((12-0)+1));
		

		switch (month)
		{
		//basic brute force for case of month
		    case 1:month = (int) 1.0; case 2:month = (int) 3.0; case 3:month = (int) 5.0;
		    case 4:month = (int) 7.0; case 5:month = (int) 8.0;case 6:month = (int) 10.0; 
		    case 7:month = (int) 12.0;               
		    System.out.println("there are 31 days");
		        break;
		    case 8:month = (int) 2.0;
		        System.out.println("there are 28 or 29 days");
		        break;
		    default:
		    	 System.out.println("there are 30 days");
		        break;
		}
		
		
		
		
}
}