package Grades;

import java.util.Scanner;

public class SumOfGrades
{
    public static void main (String[] args)
    {
        calculateSumOfGradesWithWhileLoop();
    }

    private static void calculateSumOfGradesWithForLoop ()
    {
        double sumOfGrades = 0;
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Enter number " + (i + 1));
            Scanner gradesScanner = new Scanner(System.in);
            if (gradesScanner.hasNextDouble())
            {
                double currentGrade = gradesScanner.nextDouble();
                sumOfGrades += currentGrade;
            }
            else
            {
                System.out.println("Print number!");
                i--;
            }
            // System.out.println("Level: " + (i + 1));
        }
        System.out.println("The result is: " + sumOfGrades);
    }

    private static void calculateSumOfGradesWithWhileLoop ()
    {
        int counter = 0;
        double sumOfGrades = 0;
        while (counter < 10)
        {
            counter++;
            System.out.println("Enter number " + (counter));
            Scanner gradesScanner = new Scanner(System.in);
            if (gradesScanner.hasNextDouble())
            {
                double currentGrade = gradesScanner.nextDouble();
                sumOfGrades += currentGrade;
            }
            else
            {
                System.out.println("Print number!");
                counter--;
            }
        }
        System.out.println("The result is: " + sumOfGrades);
    }
}
