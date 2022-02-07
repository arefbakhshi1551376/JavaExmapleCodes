package Stars;

import java.util.Scanner;

public class NullDiamond
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");

        int userEnter = scanner.nextInt(); // 2
        int centerOfRows = userEnter + 1; // 3
        int numberOfRows = 2 * userEnter + 1; // 5
        boolean isNotReverse = true;
        int counter = 0;

        for (int currentRow = 1; currentRow <= numberOfRows; currentRow++) // We are in row 2; currentRow = 2
        {
            StringBuilder stringBuilder = new StringBuilder();
            if (isNotReverse)
            {
                counter++;
                if (currentRow == centerOfRows)
                {
                    isNotReverse = false;
                }
            }
            else
            {
                counter--;
            }

            int differentNumber = counter - 1; // 1
            int minNumber = centerOfRows - differentNumber; // 2
            int maxNumber = centerOfRows + differentNumber; // 4
            for (int j = 1; j <= numberOfRows; j++)
            {
                if (j == minNumber || j == maxNumber)
                {
                    stringBuilder.append("*  ");
                }
                else
                {
                    stringBuilder.append("   ");
                }
            }

            System.out.println(stringBuilder);
        }
    }
}
