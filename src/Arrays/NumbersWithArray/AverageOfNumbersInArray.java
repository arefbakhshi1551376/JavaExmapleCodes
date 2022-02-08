package Arrays.NumbersWithArray;

public class AverageOfNumbersInArray
{
    public static double Calculate (double[] numbers)
    {
        double finalSum = SumOfNumbersInArray.Calculate(numbers);
        return finalSum / numbers.length;
    }
}
