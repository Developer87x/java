import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      String example = new String("Hello Moto,");

        System.out.println(example.length());
        System.out.println(example.charAt(example.length() - 1));

        if(example.contains("@"))
        {
            System.out.println("this is an email address");
        }
    }
}