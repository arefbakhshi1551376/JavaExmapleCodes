package Arrays.NumbersWithArray;

import java.util.Arrays;

public class Start
{
    public static void main (String[] args)
    {
        double[] numbers = new double[10];
        for (int i = 1; i <= 10; i++)
        {
            numbers[i - 1] = i * 10;
        }
        double sumRes = SumOfNumbersInArray.Calculate(numbers);
        double avgRes = AverageOfNumbersInArray.Calculate(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println("The sum is: " + sumRes);
        System.out.println("The average is: " + avgRes);
    }
}
