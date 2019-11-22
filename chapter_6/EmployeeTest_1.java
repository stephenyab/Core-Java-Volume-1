package Core_Java_Volume_1.chapter_6;

import java.util.Arrays;

public class EmployeeTest_1 {
    public static void main(String[] args) {
        Employee_1[] staff = new Employee_1[3];

        staff[0] = new Employee_1("Harry Hacker", 35000);
        staff[1] = new Employee_1("Carl Cracker", 75000);
        staff[2] = new Employee_1("Tony Tester", 38000);

        Arrays.sort(staff);

        for (Employee_1 e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}
