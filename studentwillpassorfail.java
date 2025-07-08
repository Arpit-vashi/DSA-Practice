import java.util.Scanner;

public class studentwillpassorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks scored by the student: ");
        int mark = sc.nextInt();

        String result = (mark < 0 || mark > 100)
                ? "Invalid marks entered."
                : (mark >= 33)
                ? "The student has passed."
                : "The student has failed.";

        System.out.println(result);
        sc.close();
    }
}
