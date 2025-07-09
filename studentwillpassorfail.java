//Write a Java program that determines if a student has passed or failed based on their marks (0-100)
import java.util.Scanner;

public class studentwillpassorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the marks scored by the student (0-100): ");

            if (!sc.hasNextInt()) {
                throw new IllegalArgumentException("Invalid input. Please enter an integer.");
            }

            int mark = sc.nextInt();

            if (mark < 0 || mark > 100) {
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
            } else {
                String result = (mark >= 33)
                        ? "The student has passed."
                        : "The student has failed.";
                System.out.println(result);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
