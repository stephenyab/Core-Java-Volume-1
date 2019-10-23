package Core_Java_Volume_1.chapter_3;

import java.util.Scanner;

public class InputTest_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("What is your name?");
        String name=input.nextLine();

        System.out.print("How old are you?");
        int age=input.nextInt();

        System.out.println("Hello, "+name+". Next year,you'll be "+(age+1));
    }
}
