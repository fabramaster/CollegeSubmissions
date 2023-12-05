package lab5;
/*
 * Alexander Ross cosc 111-003
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Random;
import java.util.Scanner;
public class DisplayMatrix {
	
	
	
	  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("enter the amount of coloums ");
			double coloums = scanner.nextDouble();
			System.out.println("enter the amount of rows ");
			double rows = scanner.nextDouble();
			printMatrix(rows, coloums);
			
	  }	
	  //the method for calling assembling the matrix
			public static void printMatrix(double rows, double coloums)
			{
				//rows for loops
				for(int i=0;i<rows;i++)
				  {//coloums l00ps 
				      for(int j=0;j<coloums;j++)
				      {
				    	  double random = Math.round( Math.random() )  ;
				         System.out.print((int)random);
				      }
				  
				     System.out.print("\n");
				  }
				  
				    }
	  }
