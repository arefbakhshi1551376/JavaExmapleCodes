import java.util.Scanner;

public class SumOfDigits
{
    public static void main (String[] args)
    {
        startCalculateSumOfDigitsFirst();
        startCalculateSumOfDigitsSecond();
    }

    private static void startCalculateSumOfDigitsFirst ()
    {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("""
                Enter your number: 
                """);
        int number = numberScanner.nextInt();
        if (number >= 10)
        {
            String numberAsString = Integer.toString(number);
            int sumOfDigits = 0;
            for (int i = 0; i < numberAsString.length(); i++)
            {
                int currentNumber = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
                sumOfDigits += currentNumber;
            }
            System.out.println(sumOfDigits);
        }
        else
        {
            System.out.println("-1");
        }
    }

    private static void startCalculateSumOfDigitsSecond ()
    {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("""
                Enter your number: 
                """);
        int number = numberScanner.nextInt();
        if (number >= 10)
        {
            int sumOfDigits = 0;
            int reminder = number % 10;
            int currentNumber = number / 10;
            while (currentNumber > 0)
            {
                sumOfDigits += reminder;
                if (currentNumber < 10)
                {
                    sumOfDigits += currentNumber;
                    break;
                }
                reminder = currentNumber % 10;
                currentNumber = currentNumber / 10;
            }
            System.out.println(sumOfDigits);
        }
        else
        {
            System.out.println("-1");
        }
    }
}
