package lab5;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
//Student name Alexander Ross
//Student number 300213662
//This Code does not run in 0(n)
//there is a note in the code where we account for integer overflow on line 31

public class Hashing {
	// with ~341,000 words, a table size of 1mil keeps the load factor low
	static final int tableSize = 1_000_000;
	public static void main(String[] args) throws IOException {
		// DONE: You will be hashing strings using polynomial in k, for all values
		// k=1 to 100. Once you have this one case (of k=31) working, you will
		// probably want to wrap your code in a for loop for k=1 to 100
		for (int i = 1; i <101 ; i++) {
			int k = i;
			// Leave these two lines alone for opening the input file
			FileReader f = new FileReader("englishWords.txt");
			Scanner sc = new Scanner(f);
			// This creates your hashtable or simulated hashtable of size tableSize
			int[] counts = new int[tableSize];
			long maxBucket=0;
			long CollisionCounter=0;
			// This loop runs through the words in the file
			while (sc.hasNext()) {
				String s = sc.nextLine();
				int index=hash(s, k);
				//to account for polynomial overflow we modulo by 1 million, if this results negative we then add 1 million
				index=index%1000000;
				if (index<0){
					index+=1000000;
				}
				counts[index]+=1;
				if (counts[index]>=2) {
					CollisionCounter++;
				}
				if (counts[index]>maxBucket){
					maxBucket=counts[index];
				}
				// DONE: remove or comment-out this next line, or modify it
				// for your own debugging purposes
				// DONE: Find hashValue of s using hash(s,k). Update your simulated hashtable
				// note: if your hash(s,k) function is correct, hash(s,31) should
				//			correspond exactly to s.hashCode();

				// DONE: Don't forget to count collisions

			}
			// DONE: Find the maximum bucket size
			System.out.println("the k value " + k + " maximum bucket size was " + maxBucket);
			// DONE: Report the total number of collisions found at this k value
			System.out.println("at this k value of "+ k + " created " + CollisionCounter + " Collisions");
			// DONE: Report the maximum bucket size found at this k value
			System.out.println("maximum bucket size was " + maxBucket + " at this k value of " + k + " with this many collisions " + CollisionCounter );
			// Leave this line alone to close the input file
			System.out.println(" ");
			f.close();
		}
	}

	public static int hash(String s, int k) {
		int[] powerOf=new int[100];
		powerOf[0]=1;
		for(int i=1; i<powerOf.length;i++) {
			powerOf[i]=k*powerOf[i-1];
		}
		int val=0;
		for(int i=0 ; i<s.length();i++) {
			val+=s.charAt(i)*powerOf[s.length()-i-1];
		}
		return val;
	}
}
/***********************************************************
 * Report your best k values here in this comment block
 * (if you want, you can output all k values and then visually
 * inspect your output for your 3 best k values). Give your 3
 * best k-values for (i) the smallest total number of collisions,
 * and also give another set of (ii) your 3 best k-values according
 * to the smallest value for the max-bucket-size.
 * 
 * My three best k values by smallest total number of collisions were
 * k[57,31,77]
 *  k value 57 had 51746 collisions
 *  K value 31 had 51765 collisions
 *  k value 77 had 51779 collisions
 *  
 *  My three best k values by the smallest value for max-bucket-size were
 *  k[43,49,19]
 * k value 43 had a maximum bucket size of 5 and 51839 collisions
 * k value 49 had a maximum bucket size of 5 and 52229 collisions
 * k value 19 had a maximum bucket size of 5 and 52236 collisions
*/