//Write a Java program to compare two numbers and display the larger one, or indicate if they are equal.
import java.util.Scanner;
public class largestof2numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("Largest Number is : "+a);
        }
        else if (b>a){
            System.out.println("Largest Number is : "+b);
        }
        else{
            System.out.println("Both Numbers are Equal");
        }
        sc.close();
    }
}