import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();


        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        int differences = (hours1 - hours) * 60 * 60 + (minutes1 - minutes) * 60 + (seconds1 - seconds);



        System.out.println(differences);
    }
}
