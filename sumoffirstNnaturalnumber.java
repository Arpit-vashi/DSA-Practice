//Write a java program to print Sum of first N natural numbers
import java.util.Scanner;

public class sumoffirstNnaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a non-negative integer to calculate the sum of natural numbers from 0 to N: ");

            if (!sc.hasNextInt()) {
                throw new IllegalArgumentException("Invalid input. Please enter a valid integer.");
            }

            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Error: Please enter a non-negative integer.");
            } else {
                int sum = sumOfNaturalNumbers(n);
                System.out.println("The sum of natural numbers from 0 to " + n + " is: " + sum);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}
