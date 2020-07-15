package Core_Java_Volume_1.chapter_5.objectAnalyzer;

import java.util.ArrayList;

/**
 * @ClassName ObjectAnalyzerTest
 * @Description
 * @Author yang
 * @Date 2020/7/15 20:36
 * @Version 1.0
 */
public class ObjectAnalyzerTest {

    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
