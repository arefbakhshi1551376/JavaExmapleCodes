package EquationSolver;

import java.util.Scanner;

public class Solver
{
    public static void FirstDegreeEquation ()
    {
        Scanner numberScanner = new Scanner(System.in);
        double firstParameter, secondParameter;

        System.out.println("Enter a:");
        firstParameter = numberScanner.nextDouble();

        System.out.println("Enter b:");
        secondParameter = numberScanner.nextDouble();

        double result = -secondParameter / firstParameter;
        System.out.println("The result is: " + result);
    }

    public static void QuadraticEquation ()
    {
        Scanner numberScanner = new Scanner(System.in);
        double firstParameter, secondParameter, thirdParameter;

        System.out.println("Enter a:");
        firstParameter = numberScanner.nextDouble();

        System.out.println("Enter b:");
        secondParameter = numberScanner.nextDouble();

        System.out.println("Enter c:");
        thirdParameter = numberScanner.nextDouble();

        double delta = Math.pow(secondParameter, 2) - (4 * firstParameter * thirdParameter);
        if (delta > 0)
        {
            System.out.println("The equation has two answers!");
            double firstAnswer = (-secondParameter + Math.sqrt(delta)) / (2 * firstParameter);
            double secondAnswer = (-secondParameter - Math.sqrt(delta)) / (2 * firstParameter);

            System.out.println("The first answer is: " + firstAnswer);
            System.out.println("The second answer is: " + secondAnswer);
        }
        else if (delta == 0)
        {
            System.out.println("The equation has one answers!");
            double answer = (-secondParameter) / (2 * firstParameter);

            System.out.println("The answer is: " + answer);
        }
        else
        {
            System.out.println("The equation has no answer!");
        }
    }
}
