import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();

        int firstDigit = input % 10;
        int secondDigit = input / 10 % 10  ;
        int thirdDigit = input / 100 % 10 ;
        String result= "" + firstDigit + secondDigit + thirdDigit;
        System.out.println(Integer.parseInt(result));


    }
}