//Write a Java program to input week number(1-7) and print day of week name using switch case.
import java.util.Scanner;

public class printdaynamebynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number (1-7) to select a day: ");
            if (!sc.hasNextInt()) {
                throw new IllegalArgumentException("Invalid input. Please enter a number between 1 and 7.");
            }

            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Error: Please enter a valid number between 1 and 7.");
                    break;
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
