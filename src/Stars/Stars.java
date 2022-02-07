package Stars;

import java.util.Scanner;

public class Stars
{
    public static void main (String[] args)
    {
        startPrintStars();
    }

    private static void startPrintStars ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");

        int numberOfRows = scanner.nextInt();
        int counter = 0;
        boolean isReverse = false;
        for (int i = 1; i <= numberOfRows; i++)
        {
            StringBuilder stars = new StringBuilder();
            if (!isReverse)
            {
                counter++;
                if (counter == 5)
                {
                    isReverse = true;
                }
            }
            else
            {
                counter--;
                if (counter == 1)
                {
                    isReverse = false;
                }
            }
            stars.append("*".repeat(Math.max(0, counter)));
            System.out.println(stars);
        }
    }
}
