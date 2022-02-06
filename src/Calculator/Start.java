package Calculator;

import java.util.Scanner;

public class Start
{
    public static void main (String[] args)
    {
        System.out.println("""
                What you want to do? \s
                1. Four operators \s
                2. Parameter \s
                3. Area \s
                """);
        Scanner userAnswerScanner = new Scanner(System.in);
        String userAnswer = userAnswerScanner.nextLine();

        switch (userAnswer)
        {
            case "1":
            {
                calculateFourOperators();
                break;
            }
            case "2":
            {
                calculateParameter();
                break;
            }
            case "3":
            {
                calculateArea();
                break;
            }
        }
    }

    private static void calculateArea ()
    {
        System.out.println("""
                What you want to do? \s
                1. square \s
                2. rectangle \s
                3. triangle \s
                4. circle \s
                """);
        Scanner userAnswerScannerForArea = new Scanner(System.in);
        String userAnswerForArea = userAnswerScannerForArea.nextLine();

        Scanner userArgumentsForObjects = new Scanner(System.in);
        switch (userAnswerForArea)
        {
            case "1":
            {
                getSquareArgumentAndCalculateItsArea(userArgumentsForObjects);
                break;
            }
            case "2":
            {
                getRectangleArgumentAndCalculateItsArea(userArgumentsForObjects);
                break;
            }
            case "3":
            {
                getTriangleArgumentAndCalculateItsArea(userArgumentsForObjects);
                break;
            }
            case "4":
            {
                getCircleArgumentAndCalculateItsArea(userArgumentsForObjects);
                break;
            }
        }
    }

    private static void getCircleArgumentAndCalculateItsArea (Scanner userArgumentsForObjects)
    {
        System.out.println("Enter radius of circle: ");
        double radius = userArgumentsForObjects.nextDouble();
        double result = Area.circle(radius);
        System.out.println("Result of area is " + result);
    }

    private static void getTriangleArgumentAndCalculateItsArea (Scanner userArgumentsForObjects)
    {
        System.out.println("Enter base of triangle: ");
        double base = userArgumentsForObjects.nextDouble();
        System.out.println("Enter height of triangle: ");
        double height = userArgumentsForObjects.nextDouble();
        double result = Area.triangle(base, height);
        System.out.println("Result of area is " + result);
    }

    private static void getRectangleArgumentAndCalculateItsArea (Scanner userArgumentsForObjects)
    {
        System.out.println("Enter width of rectangle: ");
        double width = userArgumentsForObjects.nextDouble();
        System.out.println("Enter height of rectangle: ");
        double height = userArgumentsForObjects.nextDouble();
        double result = Area.rectangle(width, height);
        System.out.println("Result of area is " + result);
    }

    private static void getSquareArgumentAndCalculateItsArea (Scanner userArgumentsForObjects)
    {
        System.out.println("Enter side of square: ");
        double side = userArgumentsForObjects.nextDouble();
        double result = Area.square(side);
        System.out.println("Result of area is " + result);
    }

    private static void calculateParameter ()
    {
        System.out.println("""
                What you want to do? \s
                1. square \s
                2. rectangle \s
                3. triangle \s
                4. circle \s
                """);
        Scanner userAnswerScannerForParameter = new Scanner(System.in);
        String userAnswerForParameter = userAnswerScannerForParameter.nextLine();

        Scanner userArgumentsForObjects = new Scanner(System.in);
        switch (userAnswerForParameter)
        {
            case "1":
            {
                getSquareArgumentAndCalculateItsParameter(userArgumentsForObjects);
                break;
            }
            case "2":
            {
                getRectangleArgumentAndCalculateItsParameter(userArgumentsForObjects);
                break;
            }
            case "3":
            {
                getTriangleArgumentAndCalculateItsParameter(userArgumentsForObjects);
                break;
            }
            case "4":
            {
                getCircleArgumentAndCalculateItsParameter(userArgumentsForObjects);
                break;
            }
        }
    }

    private static void getCircleArgumentAndCalculateItsParameter (Scanner userArgumentsForObjects)
    {
        System.out.println("Enter radius of circle: ");
        double radius = userArgumentsForObjects.nextDouble();
        double result = Parameter.circle(radius);
        System.out.println("Result of parameter is " + result);
    }

    private static void getTriangleArgumentAndCalculateItsParameter (Scanner userArgumentsForObjects)
    {
        System.out.println("Enter first side of triangle: ");
        double firstSide = userArgumentsForObjects.nextDouble();
        System.out.println("Enter second side of triangle: ");
        double secondSide = userArgumentsForObjects.nextDouble();
        System.out.println("Enter third side of triangle: ");
        double thirdSide = userArgumentsForObjects.nextDouble();
        double result = Parameter.triangle(firstSide, secondSide, thirdSide);
        System.out.println("Result of parameter is " + result);
    }

    private static void getRectangleArgumentAndCalculateItsParameter (Scanner userArgumentsForObjects)
    {
        System.out.println("Enter width of rectangle: ");
        double width = userArgumentsForObjects.nextDouble();
        System.out.println("Enter height of rectangle: ");
        double height = userArgumentsForObjects.nextDouble();
        double result = Parameter.rectangle(width, height);
        System.out.println("Result of parameter is " + result);
    }

    private static void getSquareArgumentAndCalculateItsParameter (Scanner userArgumentsForObjects)
    {
        System.out.println("Enter side of square: ");
        double side = userArgumentsForObjects.nextDouble();
        double result = Parameter.square(side);
        System.out.println("Result of parameter is " + result);
    }

    private static void calculateFourOperators ()
    {
        System.out.println("""
                What you want to do? \s
                1. + \s
                2. - \s
                3. * \s
                4. / \s
                """);
        Scanner userAnswerScannerForFourOperators = new Scanner(System.in);
        String userAnswerForFourOperators = userAnswerScannerForFourOperators.nextLine();

        Scanner userNumbersForFourOperators = new Scanner(System.in);
        switch (userAnswerForFourOperators)
        {
            case "1":
            {
                getTwoNumbersAndPrintSumOfTheme(userNumbersForFourOperators);
                break;
            }
            case "2":
            {
                getTwoNumbersAndPrintMinusOfTheme(userNumbersForFourOperators);
                break;
            }
            case "3":
            {
                getTwoNumbersAndPrintMultipleOfTheme(userNumbersForFourOperators);
                break;
            }
            case "4":
            {
                getTwoNumbersAndPrintDivideOfTheme(userNumbersForFourOperators);
                break;
            }
        }
    }

    private static void getTwoNumbersAndPrintDivideOfTheme (Scanner userNumbersForFourOperators)
    {
        System.out.println("Enter your number 1: ");
        double userNumber1 = userNumbersForFourOperators.nextDouble();
        System.out.println("Enter your number 2: ");
        double userNumber2 = userNumbersForFourOperators.nextDouble();
        double result = FourOperators.divide(userNumber1, userNumber2);
        System.out.println("Result of sum is " + result);
    }

    private static void getTwoNumbersAndPrintMultipleOfTheme (Scanner userNumbersForFourOperators)
    {
        System.out.println("Enter your number 1: ");
        double userNumber1 = userNumbersForFourOperators.nextDouble();
        System.out.println("Enter your number 2: ");
        double userNumber2 = userNumbersForFourOperators.nextDouble();
        double result = FourOperators.multiple(userNumber1, userNumber2);
        System.out.println("Result of sum is " + result);
    }

    private static void getTwoNumbersAndPrintMinusOfTheme (Scanner userNumbersForFourOperators)
    {
        System.out.println("Enter your number 1: ");
        double userNumber1 = userNumbersForFourOperators.nextDouble();
        System.out.println("Enter your number 2: ");
        double userNumber2 = userNumbersForFourOperators.nextDouble();
        double result = FourOperators.minus(userNumber1, userNumber2);
        System.out.println("Result of sum is " + result);
    }

    private static void getTwoNumbersAndPrintSumOfTheme (Scanner userNumbersForFourOperators)
    {
        System.out.println("Enter your number 1: ");
        double userNumber1 = userNumbersForFourOperators.nextDouble();
        System.out.println("Enter your number 2: ");
        double userNumber2 = userNumbersForFourOperators.nextDouble();
        double result = FourOperators.sum(userNumber1, userNumber2);
        System.out.println("Result of sum is " + result);
    }
}
