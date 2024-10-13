import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Problem 1
        System.out.println("Enter a positive integer:");
        int n = sc.nextInt();
        System.out.println("Random numbers:");
        printRandom3(n);

        // Problem 2
        System.out.println("Enter the first x-coordinate:");
        double x1 = sc.nextDouble();
        System.out.println("Enter the second x-coordinate:");
        double x2 = sc.nextDouble();
        System.out.println("Enter the first y-coordinate:");
        double y1 = sc.nextDouble();
        System.out.println("Enter the second y-coordinate:");
        double y2 = sc.nextDouble();
        System.out.println("Slope: " + calcSlope(x1, x2, y1, y2));

        // Problem 3
        System.out.println("Enter two doubles:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Distance: " + roundedDist(d1, d2));
    }

    // Problem 1: Method to print 3 random integers from 2 to n + 2 inclusive
    public static void printRandom3(int n)
    {
        for (int i = 0; i < 3; i++)
        {
            int randomNum = (int) (Math.random() * (n + 1)) + 2; // Range [2, n + 2]
            System.out.println(randomNum);
        }
    }

    // Problem 2: Method to calculate the slope between two coordinates
    public static double calcSlope(double x1, double x2, double y1, double y2)
    {
        return (y2 - y1) / (x2 - x1);
    }

    // Problem 3: Method to calculate and round the distance between two doubles
    public static int roundedDist(double a, double b)
    {
        double dist = Math.abs(b - a);
        return (int) Math.round(dist); // Rounds to the nearest integer
    }
}