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

public class TriangularNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int count = 0;
int sum = 3;




System.out.println("Enter the amount of triangles to generate");
int input = scanner.nextInt();


for (int i = 3; count < input; i++) {
    System.out.println(sum);
    sum += i;
    count++;
}
}
}
