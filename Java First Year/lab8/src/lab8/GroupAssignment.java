package lab8;

import java.util.Scanner;



public class GroupAssignment
{
    public static void main(String[] args)
    {
       // prompt the user to enter first and last name 
    	Scanner scanner = new Scanner(System.in);
   
		System.out.println("first and last name");
		
       // read the user input
		String name = scanner.nextLine();
		//check if all letters
		boolean namecheck = isAllLetters(name);
		if (namecheck = false) {
			
			return;
		}
       // call the getLastName method
		String lastName = getLastName(name);
		System.out.println(lastName);
       // call the group method
		String group = group(lastName);
		System.out.println(group);
    }
    
    public static String group(String lastName)
    {String groupAssigned="";
    	char c = lastName.toUpperCase().charAt(0);
    	 if ('A' <= c && c <= 'I') {
    		 
         groupAssigned = "1";
          
    	 }
    	 else if ('J' <= c && c <= 'S') {
    		  groupAssigned = "2";
    
    	 }
    	 else{
    		  groupAssigned = "3";
    		 
    	 }
        return groupAssigned;
    }
    public static String getLastName(String name)
    {
        String last = "";
         //using the substring from String class method, get the last name out of the name string
        String[] array = name.split("\\s");
       last = array[array.length -1];
        return last;   
    } 
    public static boolean isAllLetters(String input)
    {
        boolean isLetter = true;
 //use the Character.isLetter method to check if each character in the string input is a letter
        for(int i = 0; i<input.length(); i++) {
        	char c = input.charAt(i);
        	 if  (Character.isLetter(c)) {
        		 isLetter = false;
                 return isLetter;    
         
        }
        	 
        }
           //return true if all characters are letters or false otherwise
		return isLetter;
       
    }
}
        