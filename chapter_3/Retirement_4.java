package Core_Java_Volume_1.chapter_3;

import java.util.Scanner;

public class Retirement_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How much money do you need to retire? ");
        double goal = input.nextDouble();

        System.out.print("How much money will you contribute every year? ");
        double payment = input.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = input.nextDouble();

        double balance = 0;
        int years = 0;

        String in;

        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            years++;

            System.out.printf("After year %d,your balance is %,.2f%n", years, balance);

            System.out.print("Ready to retire?(Y/N) ");
            in = input.next();
        } while (in.equals("N"));

    }
}
