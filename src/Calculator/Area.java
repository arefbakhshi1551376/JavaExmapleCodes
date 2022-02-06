package Calculator;

public class Area
{
    public static double square (double side)
    {
        return Math.pow(side, 2);
    }

    public static double rectangle (double width, double height)
    {
        return width * height;
    }

    public static double triangle (double base, double height)
    {
        return base * height / 2;
    }

    public static double circle (double radius)
    {
        return Math.PI * Math.pow(radius, 2);
    }
}
