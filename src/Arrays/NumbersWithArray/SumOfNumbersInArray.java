package Arrays.NumbersWithArray;

public class SumOfNumbersInArray
{
    public static double Calculate (double[] numbers)
    {
        double finalSum = 0;
        for (double number : numbers)
        {
            finalSum += number;
        }
        return finalSum;
    }
}
