package lab7;

import java.util.Scanner;

public class TestLinearSystem {
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter A");
			double a = scanner.nextDouble();
			System.out.println("Enter B");
			double b = scanner.nextDouble();
			System.out.println("Enter C");
			double c = scanner.nextDouble();
			System.out.println("Enter D");
			double d = scanner.nextDouble();
			System.out.println("Enter E");
			double e = scanner.nextDouble();
			System.out.println("Enter F");
			double f = scanner.nextDouble();
			
			LinearEquations LinearEquations = new LinearEquations(a,b,c,d,e,f);
			boolean bool = LinearEquations.isSolvable();
			if (bool == false) {
				System.out.println("The equation has no solution");
			}else {
				
			
			
			System.out.println(LinearEquations.getX());
			System.out.println(LinearEquations.getY	());
			}	
}
}
