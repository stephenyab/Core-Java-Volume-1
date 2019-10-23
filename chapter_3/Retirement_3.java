package Core_Java_Volume_1.chapter_3;

import java.util.Scanner;

public class Retirement_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("How much money do you need to retire? ");
        double goal=input.nextDouble();

        System.out.print("How much money will you contribute every year? ");
        double payment=input.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate=input.nextDouble();

        double balance=0;
        int years=0;

        while(balance<goal){
            balance+=payment;
            double interest=balance*interestRate / 100;
            balance+=interest;
            years++;
        }

        System.out.println("You can retire in "+years+" years.");

    }
}
