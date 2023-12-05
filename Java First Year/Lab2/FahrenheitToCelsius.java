
public class FahrenheitToCelsius 
{ 
    public static void main(String[] args) 
    { 
        double fahrenheit;
        double celsius;
        fahrenheit = 100; //the temperature in Fahrenheit is 100F 
 
        //the formula for temperature conversion is 
        // C = 5/9 (F - 32) 
       //write your code here to implement the above formula and output the result
        double Answer1 = (fahrenheit - 32);
        double Answer2 = (Answer1 * 5/9 );
        System.out.printf("The Temprature in fahrenheight is " + fahrenheit + "%nThe Temprature in celcuis is: " + Answer2);
        
        
    } 
}