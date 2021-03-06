import java.util.Scanner;

public class Hello
{
    public static void main (String[] args)
    {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        // *************************** int *************************** //
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println(intMinValue);
        System.out.println(intMaxValue);

        // *************************** float *************************** //
        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println(floatMinValue);
        System.out.println(floatMaxValue);

        // *************************** double *************************** //
        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println(doubleMinValue);
        System.out.println(doubleMaxValue);

        // *************************** long *************************** //
        long longMinValue = Long.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;
        long a = 9_223_372_036_854_775_807L;
        System.out.println(longMinValue);
        System.out.println(longMaxValue);

        // *************************** pow2 *************************** //
        System.out.println("Enter your number:");
        Scanner numberScanner = new Scanner(System.in);
        long number = numberScanner.nextLong();
        int counter = 0;
        while (number >= 1)
        {
            System.out.println("Number is: " + number);
            number /= 2;
            counter++;
        }
        System.out.println(counter);
    }
}
