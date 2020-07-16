package Core_Java_Volume_1.chapter_6.clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author yang
 * @Description
 * @Date 2020/7/15 21:32
 * @Param
 * @return
 **/
public class Employee implements Comparable<Employee>, Cloneable {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();

        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
