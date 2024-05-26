import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here.
        int input = scanner.nextInt();

        int mod = input % 1_00;
        int result = mod / 10;

        System.out.println(result);

    }
}