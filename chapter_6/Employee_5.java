package Core_Java_Volume_1.chapter_6;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee_5 implements Cloneable {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee_5(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public Employee_5 clone() throws CloneNotSupportedException {
        Employee_5 cloned = (Employee_5) super.clone();

        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    public void setHireDay(int year,int month,int day){
        Date newHireDay=new GregorianCalendar(year,month-1,day).getTime();
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
    public String toString() {
        return "Employee[name="+name+",salary="+salary+",hireDay="+hireDay+"]";
    }
}
