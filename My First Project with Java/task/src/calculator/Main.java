package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double bubblegum =202d;
        double toffee =118d;
        double ice_cream =2250d;
        double milk_chocolate =1680d;
        double doughnut =1075d;
        double pancake =80d;
        double sum =0.0d;



        Scanner input = new Scanner(System.in);

         sum += bubblegum+ toffee + ice_cream+ milk_chocolate + doughnut + pancake;
        System.out.println("Item name\t Earned amount:");
        System.out.println("Bubblegum\t$"+bubblegum);
        System.out.println("Toffee\t$"+toffee);
        System.out.println("Ice cream\t$"+ice_cream);
        System.out.println("Milk chocolate\t$"+milk_chocolate);
        System.out.println("Doughnut\t$"+doughnut);
        System.out.println("Pancake\t$"+pancake);
        System.out.println();
        System.out.println("Income: $"+sum);


        System.out.println("Staff expenses:");
        double staff_expenses = input.nextDouble();
        System.out.println("Other expenses:");
        double other_expenses = input.nextDouble();

        System.out.println("Net Income: $"+(sum-staff_expenses-other_expenses));








    }
}