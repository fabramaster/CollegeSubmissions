package lab8;

import java.util.Scanner;

public class SpokenNumber {
	String string;
	String Singles[] = { "", "one", "two", "three", "four", "five", "six", "seven",
			"eight", "nine", };
	String teens[] = { "ten", "eleven", "twelve", "thirteen", "fourteen",
			"fifteen", "sixteen", "seventeen", "eighteen", "ninteen", };
	String Twenties[] = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy",
			"eighty", "ninty" };
	String amounts[] = { "hundred", "thousand" };
	
	public static void main(String[] args) {
		SpokenNumber w = new SpokenNumber();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		String inwords = w.convert(num);
		System.out.println(inwords);
	}
	
	public String convert(int number) {
		int n = 1;
		int word;
		string = "";
		while (number != 0) {
			switch (n) {
			case 1:
				word = number % 100;
				pass(word);
				if (number > 100 && number % 100 != 0) {
					display("and ");
				}
				number /= 100;
				break;

			case 2:
				word = number % 10;
				if (word != 0) {
					display(" ");
					display(amounts[0]);
					display(" ");
					pass(word);
				}
				number /= 10;
				break;

			case 3:
				word = number % 100;
				if (word != 0) {
					display(" ");
					display(amounts[1]);
					display(" ");
					pass(word);
				}
				number /= 100;
				break;

			case 4:
				word = number % 100;
				if (word != 0) {
					display(" ");
					display(amounts[2]);
					display(" ");
					pass(word);
				}
				number /= 100;
				break;

			case 5:
				word = number % 100;
				if (word != 0) {
					display(" ");
					display(amounts[3]);
					display(" ");
					pass(word);
				}
				number /= 100;
				break;

			}
			n++;
		}
		return string;
	}
	public void display(String s) {
		String display;
		display = string;
		string = s;
		string += display;
	}	
	public void pass(int number) {
		int word, q;
		if (number < 10) {
			display(Singles[number]);
		}
		if (number > 9 && number < 20) {
			display(teens[number - 10]);
		}
		if (number > 19) {
			word = number % 10;
			if (word == 0) {
				q = number / 10;
				display(Twenties[q - 2]);
			} else {
				q = number / 10;
				display(Singles[word]);
				display(" ");
				display(Twenties[q - 2]);
			}
		}
	}

	

	
}