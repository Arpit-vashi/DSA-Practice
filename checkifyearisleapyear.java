//Write a Java program that takes a year from the user and print whether that year is a leap year or not.
import java.util.Scanner;

public class checkifyearisleapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a year: ");

            if (!sc.hasNextInt()) {
                throw new IllegalArgumentException("Invalid input. Please enter a valid year.");
            }

            int year = sc.nextInt();

            if (year < 0) {
                System.out.println("Error: Year cannot be negative.");
            } else if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
