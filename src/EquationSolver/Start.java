package EquationSolver;

import java.util.Scanner;

public class Start
{
    public static void main (String[] args)
    {
        startCalculate();
    }

    private static void startCalculate ()
    {
        System.out.println("""
                Choose: \s
                1. ax + b = 0 \s
                2. ax2 + bx + c = 0 \s                
                """);
        Scanner userAnswerScanner = new Scanner(System.in);
        String userAnswer = userAnswerScanner.nextLine();
        switch (userAnswer)
        {
            case "1":
            {
                Solver.FirstDegreeEquation();
                break;
            }

            case "2":
            {
                Solver.QuadraticEquation();
                break;
            }
        }
    }
}
