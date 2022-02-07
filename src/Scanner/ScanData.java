package Scanner;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ScanData
{
    public static void main (String[] args)
    {
        Scanner dataScanner = new Scanner(System.in);
        String name;
        int birthYear;
        int age;
        System.out.println("Enter your name: ");
        if (dataScanner.hasNextLine())
        {
            name = dataScanner.nextLine();
        }
        else
        {
            name = "------";
        }
        System.out.println("Enter your birth year: ");
        if (dataScanner.hasNextInt())
        {
            birthYear = dataScanner.nextInt();
            age = LocalDateTime.now().getYear() - birthYear;
        }
        else
        {
            age = 0;
        }
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
    }
}
