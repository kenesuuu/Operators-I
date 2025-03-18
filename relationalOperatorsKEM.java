import java.util.Scanner;

public class relationalOperatorsKEM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define two integers x and y
        System.out.print("Enter value for x: ");
        int x = input.nextInt();
        System.out.print("Enter value for y: ");
        int y = input.nextInt();

        // Relational Operators
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        // Bonus Task: Range Check
        if (x >= 10 && x <= 50) {
            System.out.println("x is within the range 10 to 50.");
        } else {
            System.out.println("x is NOT within the range 10 to 50.");
        }

        input.close();
    }
}