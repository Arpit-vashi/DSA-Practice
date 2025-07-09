//Write a Java program to find the largest of three numbers entered by the user.
import java.util.Scanner;

public class largestof3numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the 3rd number: ");
        int num3 = sc.nextInt();

        int largest = largestOf3Numbers(num1, num2, num3);
        System.out.println("The largest number is: " + largest);

        sc.close();
    }

    public static int largestOf3Numbers(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
