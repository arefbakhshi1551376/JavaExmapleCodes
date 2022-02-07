package SecondsMinutes;

import java.util.Scanner;

public class SecondMinutes
{

    private static final String INVALID_MESSAGE = "Invalid parameters.";

    public static void main (String[] args)
    {
        Scanner secondsMinutesScanner = new Scanner(System.in);
        System.out.println("""
                Enter the minutes and the seconds.
                First, enter seconds: \n
                """);
        int seconds = secondsMinutesScanner.nextInt();

        System.out.println("""
                Second, enter minutes: \n
                """);
        int minutes = secondsMinutesScanner.nextInt();

        if (seconds > 59 || minutes < 0 || seconds < 0)
        {
            System.out.println(INVALID_MESSAGE);
        }
        int hours = 0;
        if (minutes == 60)
        {
            hours = 1;
            minutes = 0;
        }
        else if (minutes > 60)
        {
            hours = minutes / 60;
            minutes = minutes % 60;
        }

        System.out.println("The result is: " + seconds + " : " + minutes + " : " + hours);
    }
}
