//Write a Java program that takes a number n as input and prints all the numbers from 0 to n.
import java.util.Scanner;

public class printnumberfrom0ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a non-negative number to print all numbers from 0 to that number: ");

            if (!sc.hasNextInt()) {
                throw new IllegalArgumentException("Invalid input. Please enter a valid integer.");
            }

            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Error: Please enter a non-negative number.");
            } else {
                printNumbersFrom0ToN(n);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void printNumbersFrom0ToN(int n) {
        for (int a = 0; a <= n; a++) {
            System.out.println(a);
        }
    }
}

