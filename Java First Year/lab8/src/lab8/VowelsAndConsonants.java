package lab8;

import java.util.Scanner;

public class VowelsAndConsonants {
	public static void main(String[] args)
    {
	
       // prompt the user to enter first and last name 
    	Scanner scanner = new Scanner(System.in);
    	//While (UserI != "stop"){
		System.out.println("please enter a string to count the vowels or enter stop to terminate");
		//user Input
		String UserI = scanner.nextLine();
		while ( true) {
		
			if ("stop".equals(UserI)) {
				
				break;
				
			}
			else {
			System.out.println(" The String " + UserI + " Contains " + vowels(UserI) + " vowel(s)" +  " and " + (consonants(UserI) - vowels(UserI)) + " consonant(s) ");
			UserI = scanner.nextLine();
		
    }
    
    }
    
    
    	//System.out.println(UserI);
}
	
	
	
	
	public static int vowels(String vowels) {
		String input = vowels.toLowerCase();
		int vcount = 0;
		for (int i = 0; i < input.length(); ++i) {
		      char ch = input.charAt(i);
		      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		          ++vcount;
		      }
		 }
		return vcount;
	}
	public static int consonants(String consonants) {
		int cCount = 0;
		String input = consonants.toLowerCase();
		for (int i = 0; i < input.length(); ++i) {
		if(input.charAt(i) >= 'a' && input.charAt(i)<='z') {      
            //Increments the consonant counter    
            cCount++;  
            
        }    
		
		}
		return cCount;
	}
}