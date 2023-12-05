package lab7;

import java.util.Scanner;

public class ThreeDShapes {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter 1 for sphere 2 for phrism");
		double choice = scanner.nextDouble();
		
		
		if (choice == 1) {
			
		System.out.println("please enter the raduis");
		double raduis = scanner.nextDouble();
		Sphere sphere = new Sphere(raduis);
		System.out.println("The volume of the sphere is "+ sphere.volumeSphere());
		
		System.out.println("The surface area is  "+ sphere.surfaceSphere());
		}else {
		System.out.println("please enter the length");
		double length = scanner.nextDouble();
		System.out.println("please enter the width");
		double width = scanner.nextDouble();
		System.out.println("please enter the height");
		double height = scanner.nextDouble();
			
		
		RectangularPrism RectangularPrism = new RectangularPrism(length,height,width);
		System.out.println("The volume of the Prism is "+ RectangularPrism.volumePrism());
		System.out.println("The surface area is  "+ RectangularPrism.surfacePrism());
		
		
		}
		
		
}
}
