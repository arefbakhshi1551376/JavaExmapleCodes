package Calculator;

public class Parameter
{
    public static double square (double side)
    {
        return side * 4;
    }

    public static double rectangle (double width, double height)
    {
        return 2 * (width + height);
    }

    public static double triangle (double side1, double side2, double side3)
    {
        return side1 + side2 + side3;
    }

    public static double circle (double radius)
    {
        return 2 * Math.PI * radius;
    }
}
