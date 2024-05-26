import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int userInput = scanner.nextInt();

        int formula = ((userInput + 1) * userInput + 2) * userInput + 3;

        System.out.println(formula);
    }
}