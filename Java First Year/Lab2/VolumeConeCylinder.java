import java.util.Scanner;

public class VolumeConeCylinder {
	final static double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double raduis;
		double height;
		
	System.out.println("Please enter the radius:");
  	raduis= scanner.nextDouble();
  	System.out.println("Please enter the height:");
  	height= scanner.nextDouble();
  	System.out.println(raduis+" Radius");
  	System.out.println(height+" height");
  	
  	double pinkFloyd = ( PI * raduis * raduis * height/3);
  	double canOfTushonka = ( PI * raduis * raduis * height);
  	
  	System.out.printf("the volume of the cone is %.2f ", pinkFloyd);
  	System.out.printf("%nthe volume of the cylinder is %.2f", canOfTushonka);
  	
  	
  	
  	
  	
  	
}
}