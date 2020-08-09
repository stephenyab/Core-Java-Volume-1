package Core_Java_Volume_1.chapter_9.map;


import Core_Java_Volume_1.chapter_4.Employee;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description
 * @Author yang
 * @Date 2020/8/9 23:11
 * @Version 1.0
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        System.out.println(staff);

        staff.remove("567-24-2546");

        staff.put("456-62-5527", new Employee("Francesca Miller"));

        System.out.println(staff.get("157-62-7935"));

        staff.forEach((k, v) -> {
            System.out.println("key=" + k + ",value=" + v);
        });
    }
}
