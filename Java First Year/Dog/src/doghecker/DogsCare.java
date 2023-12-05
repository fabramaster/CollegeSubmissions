package doghecker;

public class DogsCare {
	public static void main(String[] args)   {
        Dog dog1 = new Dog("Neda", "tricolor", 3, 12, "Beagle", 'F');
        Dog dog2 = new Dog("Axel", "brindle", 5, 30, "Boxer", 'M');
        Dog dog3 = new Dog("Tan", "light brown", 6, 8, "Shih Tzu", 'M');
        System.out.println("We have the following guests in our DogsCare facility:\n");
        System.out.println(dog1.name + ": " + dog1.breed + ", " + dog1.gender + ", " + 
                           dog1.age + " years old, " + dog1.weight + " kg, " + dog1.color);         
                  
        System.out.println(dog2.name + ": " + dog2.breed + ", " + dog2.gender + ", " + 
                           dog2.age + " years old, " + dog2.weight + " kg, " + dog2.color);       
        System.out.println(dog3.name + ": " + dog3.breed + ", " + dog3.gender + ", " + 
                           dog3.age + " years old, " + dog3.weight + " kg, " + dog3.color);         
        Dog dog4 = new Dog();
        System.out.println(dog4.name + ": " + dog4.breed + ", " + dog4.gender + ", " + 
                           dog4.age + " years old, " + dog4.weight + " kg, " + dog4.color);
    }
}

