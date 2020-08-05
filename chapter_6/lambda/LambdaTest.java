package Core_Java_Volume_1.chapter_6.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * @ClassName LambdaTest
 * @Description
 * @Author yang
 * @Date 2020/7/16 16:23
 * @Version 1.0
 */
public class LambdaTest {

    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> {
            System.out.println("The time is " + new Date());
        });
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}