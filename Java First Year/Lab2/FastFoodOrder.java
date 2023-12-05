/* Alexander Ross
 * COSC 111 L05
 * 
 * 
 * 
 */






import java.util.Scanner;

public class FastFoodOrder {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int Burgers;
	int Fries;
	int Sodas;
	double preTaxBurgers;
	double preTaxFries;
	double preTaxSodas;
	double preTax;
	double taxOutput;
	double total;
	
	
	System.out.println("how many Burgers? ");
  	Burgers = scanner.nextInt();
  	System.out.println("how many Fries? ");
  	Fries = scanner.nextInt();
  	System.out.println("how many Sodas? ");
  	Sodas = scanner.nextInt();
  	
  	
  	preTaxBurgers = (Burgers * 3.29);//gets our price by multiplying our user input by the prices
  	preTaxFries = (Fries * 2.39);
  	preTaxSodas = (Sodas * 1.49);
  	preTax = (preTaxBurgers + preTaxFries + preTaxSodas);//adds our prices together for a pre tax total
  	taxOutput = (preTax * .12);//gets our tax $$$
  	total = (taxOutput + preTax); // our final price
  	
  	
  	System.out.printf("Total Before tax = $%.2f", preTax); //prints our total before tax
  	System.out.printf("%n Total tax = $%.2f", taxOutput); //prints how much tax
  	System.out.printf("%n Final Total = $%.2f", total);//prints the total
  	scanner.close();
  	
  	
}
	
}
