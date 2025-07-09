//Write a Java program that functions as a simple calculator for two numbers, allowing the user to perform addition, subtraction, multiplication, or division.
import java.util.Scanner;

public class twonumbercalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.println("Select Operator You want to use:");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");

        int op = sc.nextInt();
        double result;

        switch (op) {
            case 1:
                result = a + b;
                System.out.println("Operator selected is + and answer is: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Operator selected is - and answer is: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Operator selected is * and answer is: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = (double) a / b;
                    System.out.println("Operator selected is / and answer is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator selected.");
                break;
        }

        sc.close();
    }
}
