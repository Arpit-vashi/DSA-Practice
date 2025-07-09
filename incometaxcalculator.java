//Write a Java program to calculate income tax based on user input
import java.util.Scanner;

public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        if (income < 0) {
            System.out.println("Income cannot be negative.");
        } else {
            double tax = calculateTax(income);
            System.out.printf("Income Tax would be: %.2f\n", tax);
        }
        sc.close();
    }

    private static double calculateTax(int income) {
        double tax = 0;
        if (income > 800000) {
            tax = income * 0.10;
        } else if (income > 200000) {
            tax = income * 0.07;
        } else if (income > 0) {
            tax = income * 0.05;
        } else {
            tax = 0;
        }
        return tax;
    }
}
