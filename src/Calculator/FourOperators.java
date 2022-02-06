package Calculator;

public class FourOperators
{
    public static int sum (int number1, int number2)
    {
        return number1 + number2;
    }

    public static double sum (double number1, double number2)
    {
        return number1 + number2;
    }

    public static float sum (float number1, float number2)
    {
        return number1 + number2;
    }

    public static long sum (long number1, long number2)
    {
        return number1 + number2;
    }

    public static int minus (int number1, int number2)
    {
        return number1 - number2;
    }

    public static double minus (double number1, double number2)
    {
        return number1 - number2;
    }

    public static float minus (float number1, float number2)
    {
        return number1 - number2;
    }

    public static long minus (long number1, long number2)
    {
        return number1 - number2;
    }

    public static int multiple (int number1, int number2)
    {
        return number1 * number2;
    }

    public static double multiple (double number1, double number2)
    {
        return number1 * number2;
    }

    public static float multiple (float number1, float number2)
    {
        return number1 * number2;
    }

    public static long multiple (long number1, long number2)
    {
        return number1 * number2;
    }

    public static int divide (int number1, int number2)
    {
        if (number2 == 0)
        {
            throw new ArithmeticException("Divide by zero");
        }
        return number1 / number2;
    }

    public static double divide (double number1, double number2)
    {
        if (number2 == 0)
        {
            throw new ArithmeticException("Divide by zero");
        }
        return number1 / number2;
    }

    public static float divide (float number1, float number2)
    {
        if (number2 == 0)
        {
            throw new ArithmeticException("Divide by zero");
        }
        return number1 / number2;
    }

    public static long divide (long number1, long number2)
    {
        if (number2 == 0)
        {
            throw new ArithmeticException("Divide by zero");
        }
        return number1 / number2;
    }
}
