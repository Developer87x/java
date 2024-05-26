import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Read the first integer
        int num1 = scan.nextInt();

        // Read the second integer
        int num2 = scan.nextInt();

        // TODO: Perform addition, multiplication, and division operations

        int addition, multiplication, division;

        addition = num1 + num2;
        multiplication = num1 * num2;
        division = num1 / num2;

        System.out.println(addition);
        System.out.println(multiplication);
        System.out.println(division);

    }
}