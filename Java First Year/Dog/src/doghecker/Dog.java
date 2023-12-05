package doghecker;

class Dog {
	String name, color;
    double age, weight;
    String breed;      
     char gender; 
	Dog(String myName, String myColor, double myAge, double myWeight, 
			String myBreed, char myGender)
			    {
			        name = myName;
			        color = myColor;
			        age = myAge;
			        weight = myWeight;
			        breed = myBreed;
			        gender = myGender;
			    }

public void dogFetches(boolean doesFetches)    {
    if (doesFetches)
         System.out.println("The dog loves a fetch game");
    else  System.out.println("Try to play with the dog");    }   
public void dogBarks(int numberBarks)    {       
     System.out.println("The dog barked " + numberBarks + " times.");
 }
public void dogWagsTail(boolean doesWagTail)    {       
     if (doesWagTail)
         System.out.println("The dog wags its tail");
 }    
public double ageHumanYears(double age)    { 
     double humanYears = 0;
     if (age <=1)
         humanYears = 15 * age;
     else if (age <= 2)
         humanYears = 24 * age;
     else
         humanYears = 24 + 4 * (age - 2);
     return humanYears;
 }
}