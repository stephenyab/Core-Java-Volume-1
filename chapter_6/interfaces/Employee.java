package Core_Java_Volume_1.chapter_6.interfaces;

/**
 * @Author yang
 * @Description 
 * @Date 2020/7/15 21:32
 * @Param 
 * @return 
 **/
public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary){
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
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
