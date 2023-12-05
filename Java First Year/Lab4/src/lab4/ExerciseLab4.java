package lab4;
/*
 * Alexander Ross cosc 111-003
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class ExerciseLab4 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
int count =0, number;
int positive = 0;
int negative = 0;

System.out.println("please enter numbers press 0 to exit");
number = scanner.nextInt();

while (number != 0 ) {
	count++;
	
	if (number > 0)
		positive++;
	else 
		negative++;
	
			//System.out.println(number);
				number = scanner.nextInt();		
				
	}


System.out.println(" there were " + count + " non zero number " + "positive " + positive + "  negative " + negative);

scanner.close();

}
} 
