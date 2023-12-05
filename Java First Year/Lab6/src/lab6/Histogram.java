package lab6;
import java.util.Random;
public class Histogram {
	public static void main(String[] args) {
		Random rand = new Random();
			  int random =0;
			  int result1 =0;
		      int[] list = new int[10];
		      
		      
		      //setting array to zero 
		      for (int i=0; i<list.length; i++) {
		    	  
		         list[i] = 0;
		        
		      }
		      
		      /*random generator with for loop 
		      for (int i=0; i<list.length; i++) {
			         list[i] = 0;
			      
		     random = rand.nextInt((100 - 50) + 1) + 50;
		    
		     
		      }
*/
		      //counting all between 51-60
		      for(int i = 0; i < list.length; i++) {
		  		
					if (random < 61) {
						result1 += 1;
					}
					//else if not 
		      }
		     
		      
		      for (int i=5; i<list.length; i++) {
			         // Print histogram labels
		    	  random = rand.nextInt((100 - 50) + 1) + 50;
		    	  
			         System.out.print ("   " + (i*10+1) + " - " + (i+1)*10 + "\t:" + random);
			         System.out.println (); 

			          
			      } 
		      }
		   }
		


