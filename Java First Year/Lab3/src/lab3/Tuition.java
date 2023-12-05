package lab3;

public class Tuition
{
  public static void main(String[] args)
  {
      double initialTuition = 10000;
      final double INCREASE = 1.07;
      double currentTuition = initialTuition;
      int years = 0;
      
     //write your code here
      
      
      while (currentTuition <= (initialTuition * 2) ) {
    	  currentTuition *= INCREASE;
    	  years++;
      }
      System.out.println (years);
      
    }
}