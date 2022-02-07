package Grades;

import java.util.Objects;
import java.util.Scanner;

public class MinMax
{
    public static void main (String[] args)
    {
        // calculateMaxNumber();
        // calculateMinNumber();
        calculateMinAndMaxNumber();
    }

    private static void calculateMaxNumber ()
    {
        boolean isContinue = true;
        double currentNumber = 0;
        double maxNumber = 0;
        while (isContinue)
        {
            System.out.println("Enter number or print ext: ");
            Scanner gradesScanner = new Scanner(System.in);
            if (gradesScanner.hasNextDouble())
            {
                currentNumber = gradesScanner.nextDouble();
                if (currentNumber > maxNumber)
                {
                    maxNumber = currentNumber;
                }
            }
            else if (gradesScanner.hasNextLine() && Objects.equals(gradesScanner.nextLine(), "ext"))
            {
                System.out.println("Finish");
                isContinue = false;
            }
        }
        System.out.println("The result is: " + maxNumber);
    }

    private static void calculateMinNumber ()
    {
        boolean isContinue = true;
        double currentNumber = 0;
        double minNumber = 0;

        int counter = 0;
        while (isContinue)
        {
            System.out.println("Enter number or print ext: ");
            Scanner gradesScanner = new Scanner(System.in);
            if (gradesScanner.hasNextDouble())
            {
                currentNumber = gradesScanner.nextDouble();
                if (counter == 0)
                {
                    minNumber = currentNumber;
                    counter++;
                }
                else
                {
                    if (currentNumber < minNumber)
                    {
                        minNumber = currentNumber;
                    }
                }
            }
            else if (gradesScanner.hasNextLine() && Objects.equals(gradesScanner.nextLine(), "ext"))
            {
                System.out.println("Finish");
                isContinue = false;
            }
        }
        System.out.println("The result is: " + minNumber);
    }

    private static void calculateMinAndMaxNumber ()
    {
        boolean isContinue = true;
        double currentNumber = 0;
        double minNumber = 0;
        double maxNumber = 0;

        int counter = 0;
        while (isContinue)
        {
            System.out.println("Enter number or print ext: ");
            Scanner gradesScanner = new Scanner(System.in);
            if (gradesScanner.hasNextDouble())
            {
                currentNumber = gradesScanner.nextDouble();
                if (counter == 0)
                {
                    minNumber = currentNumber;
                    counter++;
                }
                else
                {
                    if (currentNumber < minNumber)
                    {
                        minNumber = currentNumber;
                    }
                    else if (currentNumber > maxNumber)
                    {
                        maxNumber = currentNumber;
                    }
                }
            }
            else if (gradesScanner.hasNextLine() && Objects.equals(gradesScanner.nextLine(), "ext"))
            {
                System.out.println("Finish");
                isContinue = false;
            }
        }
        System.out.println("The min number is: " + minNumber);
        System.out.println("The max number is: " + maxNumber);
    }
}
