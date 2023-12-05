package lab5;
public class CalcPop {
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