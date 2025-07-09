import java.util.Scanner;

public class checknumberispositiveornegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");

            if (!sc.hasNextDouble()) {
                throw new IllegalArgumentException("Invalid input. Please enter a valid number.");
            }

            double num = sc.nextDouble();

            if (num > 0) {
                System.out.println("The number is positive.");
            } else if (num < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
