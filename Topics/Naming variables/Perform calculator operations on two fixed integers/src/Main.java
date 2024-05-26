import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare two int variables for the calculation
        int a = 4;
        int b = a++;
        int c = --a + b++;
        int result = ++a - (c++ - b) + c;

        System.out.println(result);
        
    }
}