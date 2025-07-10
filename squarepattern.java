//Write a java program to take user input and print square of that size

import java.util.Scanner;

public class squarepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer for the size of the square: ");

            if (!sc.hasNextInt()) {
                throw new IllegalArgumentException("Invalid input. Please enter a valid integer.");
            }

            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Error: Please enter a positive integer greater than zero.");
            } else {
                printSquarePattern(n);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void printSquarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
