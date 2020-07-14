package Core_Java_Volume_1.chapter_5.ArrayList;

import Core_Java_Volume_1.chapter_4.equals.Employee;

import java.util.ArrayList;

/**
 * @ClassName ArrayListTest
 * @Description
 * @Author yang
 * @Date 2020/7/14 21:47
 * @Version 1.0
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 5000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 4000, 1990, 3, 15));

        for (Employee employee : staff) {
            employee.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println(e.getSalary());
        }
    }
}
