package Arrays.ReverseArray;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Start
{
    public static void main (String[] args)
    {
        calculateReversedArray();
    }

    private static void calculateReversedArray ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the numbers: ");
        if (scanner.hasNextInt())
        {
            double[] numbers = getNumbers(scanner);
            System.out.println("Numbers are: " + Arrays.toString(numbers));
            double[] reversedNumbers = getReversedNumbersWithHalfLength(numbers);
            System.out.println("Numbers are: " + Arrays.toString(reversedNumbers));
        }
    }

    private static double[] getReversedNumbersWithCounter (double @NotNull [] numbers)
    {
        double[] reversedNumbers = new double[numbers.length];

        int counter = 0;
        for (int i = numbers.length - 1; i >= 0; i--)
        {
            reversedNumbers[counter] = numbers[i];
            counter++;
        }
        return reversedNumbers;
    }

    private static double[] getReversedNumbersWithHalfLength (double @NotNull [] numbers)
    {
        int maxIndex = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++)
        {
            double temp = numbers[maxIndex - i];
            numbers[maxIndex - i] = numbers[i];
            numbers[i] = temp;

        }
        return numbers;
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
