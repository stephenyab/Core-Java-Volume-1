package Core_Java_Volume_1.chapter_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfTest_16 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[]) googCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) googCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception");
        b = (String[]) badCopyOf(b, 10);

    }

    public static Object[] badCopyOf(Object[] a, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    public static Object googCopyOf(Object a, int newLength) {
        Class cl = a.getClass();
        if (!cl.isArray())
            return null;
        Class componenType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componenType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
