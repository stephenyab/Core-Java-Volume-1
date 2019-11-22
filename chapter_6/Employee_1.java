package Core_Java_Volume_1.chapter_6;

public class Employee_1 implements Comparable<Employee_1> {

    private String name;
    private double salary;

    public Employee_1(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }

    @Override
    public int compareTo(Employee_1 o) {
        return Double.compare(salary,o.salary);
    }
}
