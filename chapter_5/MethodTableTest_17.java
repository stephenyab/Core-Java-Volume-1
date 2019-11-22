package Core_Java_Volume_1.chapter_5;

import java.lang.reflect.Method;

public class MethodTableTest_17 {
    public static void main(String[] args) throws NoSuchMethodException {
        Method square = MethodTableTest_17.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        printTable(1,10,10,square);
        printTable(1,10,10,sqrt);
    }

    public static double square(double x) {
        return x * x;
    }

    public static void printTable(double form, double to, int n, Method f) {
        System.out.println(f);
        double dx=(to-form)/(n-1);

        for(double x=form;x<=10;x+=dx){
            try{
                double y= (double) f.invoke(null,x);
                System.out.printf("%10.4f | %10.4f%n",x,y);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
