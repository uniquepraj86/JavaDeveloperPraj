package array.starpattern;

import java.util.Scanner;

public class ThreeStar{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide number of rows to print... ");
        int row = scanner.nextInt();
        System.out.println("\nThe star pattern is... ");
        for (int m = 1; m <= row; m++)
        {
            for (int n = 1; n <= row; n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
