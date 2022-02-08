package Arrays.MinMax;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Start
{
    public static void main (String[] args)
    {
        calculateMinAndMax();
    }

    private static void calculateMinAndMax ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the numbers: ");
        if (scanner.hasNextInt())
        {
            double[] numbers = getNumbers(scanner);
            System.out.println("Numbers are: " + Arrays.toString(numbers));

            double[] minMax = {0, 0};
            getMinMaxNumbers(numbers, minMax);
            System.out.println("Min number is: " + minMax[0]);
            System.out.println("Max number is: " + minMax[1]);
        }
    }

    private static void getMinMaxNumbers (double @NotNull [] numbers, double[] minMax)
    {
        if (numbers.length > 2)
        {
            for (int i = 2; i < numbers.length; i++)
            {
                getFirstTwoMinMaxNumbers(numbers, minMax);
                double newNumber = numbers[i];
                if (newNumber < minMax[0])
                {
                    minMax[0] = newNumber;
                }
                else if (newNumber > minMax[1])
                {
                    minMax[1] = newNumber;
                }
            }
        }
        else if (numbers.length == 2)
        {
            getFirstTwoMinMaxNumbers(numbers, minMax);
        }
        else
        {
            System.out.println("No min and max;");
        }
    }

    private static void getFirstTwoMinMaxNumbers (double[] numbers, double[] minMax)
    {
        if (numbers[0] > numbers[1])
        {
            minMax[0] = numbers[1];
            minMax[1] = numbers[0];
        }
        else if (numbers[0] < numbers[1])
        {
            minMax[0] = numbers[0];
            minMax[1] = numbers[1];
        }
        else
        {
            minMax[0] = numbers[0];
            minMax[1] = numbers[1];
        }
    }

    private static double @NotNull [] getNumbers (@NotNull Scanner scanner)
    {
        int numberOfNumbers = scanner.nextInt();
        double[] grades = new double[numberOfNumbers];

        for (int i = 0; i < numberOfNumbers; i++)
        {
            System.out.println("Enter number number " + (i + 1));
            if (scanner.hasNextDouble())
            {
                double newNumber = scanner.nextDouble();
                grades[i] = newNumber;
            }
        }
        return grades;
    }
}
