package Core_Java_Volume_1.chapter_4;

/**
 * @ClassName StaticTest
 * @Description
 * @Author 26232
 * @Date 2020/6/24 19:37
 * @Version 1.0
 */
public class StaticTest {

    public static void main(String[] args) {
        StaticEmployee[] staff = new StaticEmployee[3];

        staff[0] = new StaticEmployee("Tom", 40000);
        staff[1] = new StaticEmployee("Dick", 60000);
        staff[2] = new StaticEmployee("Harry", 65000);

        for (StaticEmployee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }

        int n = StaticEmployee.getNextId();
        System.out.println("Next available id=" + n);
    }
}

class StaticEmployee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public StaticEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static void main(String[] args) {
        StaticEmployee e = new StaticEmployee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
