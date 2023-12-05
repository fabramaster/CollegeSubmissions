package lab2;
//Alexander Ross
//300213662

/**
 *  A collection of goodily-implemented functions.
 */
public class GoodFunctions {
	/** An correctly implemented bubbleSort routine.
	 * @param a array to be sorted
	 * corrected by not being restricted by the amount of steps we can have	 */
	//DONE
	static void bubbleSort(int[] a) {  
		int n = a.length;  
		int temp = 0;  
		for(int i=0; i < n; i++){  
			for(int j=1; j < (n-i); j++){  
				if(a[j-1] > a[j]){  
					temp = a[j-1];  
					a[j-1] = a[j];  
					a[j] = temp;  
				}  
			}  
		}  
	}  
	/** A sort routine that works by swapping randomly selected
	 *  elements if they are out of order
	 * @param a array to be sorted
	 */
	//DONE
	 public static void randomSort(int[] a) {
     	 	for (int steps = 1; steps < 1000000; steps++) {
            		int firstIndex = (int)(Math.random()*a.length);
            		int secondIndex = (int)(Math.random()*a.length);
            		if (firstIndex < secondIndex && a[firstIndex] > a[secondIndex]) {
                		swap(a, firstIndex, secondIndex);
            		}
        	}
    	}
	/** Finds the number of digits in a number. Eg. n=3482 has 4 digits
	 * and n=-54638 has 5 digits and n=8 has 1 digit 
	 * @param n
	 * @return the number of digits in n
	 */
	 //DONE
	public static int numDigits(int n) {
		//this way, if we get 0, we return the amount of digits as 1 as 0 is a digit
		n = Math.abs(n);
		int numDigits = 0;
		if ( n != 0) {
			while (n > 0) {
				n = n/10;
				numDigits++;
			}
			return numDigits;
		}else {
			numDigits = 1;
			return numDigits;
		}
	}
	
	
	/** Returns the average (rounded down) of two ints a and b.
	 * @param a an integer
	 * @param b an integer
	 * @return the average of the integers
	 * this was corrected by having a double instead of long preventing integer overflow. also decimals now
	 */
	//DONE
	public static long average(long a, long b) {
		return (a+b)/2;
		// beware! adding two integers is subject to integer overflow 
	}

	/** Determines if the given String s reads backwards as it does forwards
	 * @param s A word to test if it is a palindrome
	 * @return true if s is a palindrome, false otherwise
	 */
	//DONE
	public static boolean isPalindrome(String s) {
		// corrected by rewriting the program to allow actual palindrome checking
		
		int strLength = s.length();
		String reverseStr = "";
		for (int i = (strLength - 1); i >=0; --i) {
			reverseStr = reverseStr + s.charAt(i);
		}
		if (s.toLowerCase().equals(reverseStr.toLowerCase())) {
			return (true);
		}
		else {
			return (false);
		}
	}
	/** Correctly swaps two elements in an array. This method does not need
	 *  to be tested
	 * @param a an integer array
	 * @param i the index of the first element to be swapped
	 * @param j the index of the second element to be swapped
	 */
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
