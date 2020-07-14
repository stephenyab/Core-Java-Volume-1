package Core_Java_Volume_1.chapter_4.inheritance;

/**
 * @ClassName Manager
 * @Description
 * @Author yang
 * @Date 2020/7/3 10:14
 * @Version 1.0
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
