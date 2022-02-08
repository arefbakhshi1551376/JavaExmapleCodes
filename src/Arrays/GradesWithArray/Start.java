package Arrays.GradesWithArray;

import java.util.Scanner;

public class Start
{
    public static void main (String[] args)
    {
        calculateAverage();
    }

    private static void calculateAverage ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the grades: ");
        if (scanner.hasNextInt())
        {
            double[] grades = getGrades(scanner);
            double finalAverage = getFinalAverage(grades);
            System.out.println("Average is: " + finalAverage);
        }
    }

    private static double[] getGrades (Scanner scanner)
    {
        int numberOfGrades = scanner.nextInt();
        double[] grades = new double[numberOfGrades];

        for (int i = 0; i < numberOfGrades; i++)
        {
            System.out.println("Enter grade number " + (i + 1));
            if (scanner.hasNextDouble())
            {
                double newGrade = scanner.nextDouble();
                grades[i] = newGrade;
            }
        }
        return grades;
    }

    private static double getFinalAverage (double[] grades)
    {
        double finalSum = 0;
        for (double grade :
                grades)
        {
            finalSum += grade;
        }
        return finalSum / grades.length;
    }
}
