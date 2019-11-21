package Core_Java_Volume_1.chapter_5;

import java.util.ArrayList;

public class ArrayListTest_11 {
    public static void main(String[] args) {
        ArrayList<Employee_9> staff = new ArrayList<>();

        staff.add(new Employee_9("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee_9("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee_9("Tony Tester", 40000, 1990, 3, 15));

        for (Employee_9 e : staff)
            e.raiseSalary(5);

        for (Employee_9 e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}
