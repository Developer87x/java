import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String text = scanner.nextLine();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        String substring = text.substring(firstNumber,secondNumber+1);

        System.out.println(substring);

    }
}