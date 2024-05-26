import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        final int divider = 60;

        // Your code comes here!

        int convertedToHours = minutes / divider;
        int convertedMinutes = minutes % divider;

        System.out.println(convertedToHours +  " hours and " + convertedMinutes + " minutes");

        scanner.close();
    }
}