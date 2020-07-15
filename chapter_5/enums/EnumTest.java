package Core_Java_Volume_1.chapter_5.enums;

import java.util.Scanner;

/**
 * @ClassName EnumTest
 * @Description
 * @Author yang
 * @Date 2020/7/15 11:34
 * @Version 1.0
 */
public class EnumTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the_.");
        }
    }
}

enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
