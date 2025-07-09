//Write a Java program to check if a person has fever based on their body temperature input.
import java.util.Scanner;

public class checkifyouhavefever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter temperature in Fahrenheit: ");

            if (!sc.hasNextFloat()) {
                throw new IllegalArgumentException("Invalid input. Please enter a valid temperature.");
            }

            float temperature = sc.nextFloat();

            if (temperature < 95.0) {
                System.out.println("Hypothermia: Temperature is too low.");
            } else if (temperature < 100.0) {
                System.out.println("You don't have a fever.");
            } else {
                System.out.println("You have a fever.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
