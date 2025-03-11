import java.rmi.*;
import java.util.Scanner;

public class AdditionClient {
	public static void main (String[] args) {
		AdditionInterface hello;
		int num1, num2;
		Scanner scan = new Scanner (System.in);

		try {
			hello = (AdditionInterface)Naming.lookup("rmi://localhost/Add");
			System.out.print ("Enter the first integer number: ");
			num1 = scan.nextInt();
			System.out.print ("Enter the second integer number: ");
			num2 = scan.nextInt();
			System.out.println("Result is :" + hello.add(num1,num2));

			}catch (Exception e) {
				System.out.println("HelloClient exception: " + e);
				}
		}
}