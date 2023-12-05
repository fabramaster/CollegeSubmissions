package lab5;

public class PopulationCheck {
    public static void main(String[] args){
        CalcPop calculate = new CalcPop();
        int result = calculate.predictPopulation(10000, 4, 10);
        System.out.println("The population will be " + result);
    }

public int predictPopulation(int population, double growthRate, double years)     
{
        int result = 0;
        double populationAmount = population;
        double count = years;
        while ((count > 0) && (populationAmount > 0))         {
        populationAmount = (populationAmount +
        (growthRate / 100) * populationAmount);
        count--;
        }
        if (populationAmount > 0)
        result = (int)populationAmount;
        return result;
    }
}