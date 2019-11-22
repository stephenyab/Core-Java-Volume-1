package Core_Java_Volume_1.chapter_5;

import java.util.ArrayList;

public class ObjectAnalyzerTest_14 {
    public static void main(String[] args) {
        ArrayList<Integer> squares=new ArrayList<>();
        for(int i=1;i<=5;i++)
            squares.add(i*i);
        System.out.println(new ObjectAnalyzer_15().toString(squares));
    }
}
