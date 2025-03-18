import java.util.Scanner;

public class modulusOperatorKEM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Finding the remainder of various division operations
        System.out.println("Enter two numbers to find the remainder:");
        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        int remainder = dividend % divisor;
        System.out.println("Remainder when " + dividend + " is divided by " + divisor + " is: " + remainder);

        // Part 2: Checking divisibility
        System.out.println("\nCheck if a number is divisible by another number:");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " is divisible by " + num2);
        } else {
            System.out.println(num1 + " is NOT divisible by " + num2);
        }

        scanner.close();
    }
}
