package Core_Java_Volume_1.chapter_6.clone;

/**
 * @ClassName CloneTest
 * @Description
 * @Author yang
 * @Date 2020/7/15 23:17
 * @Version 1.0
 */
public class CloneTest {

    public static void main(String[] args) {
        try {
            Employee original = new Employee("John Q .Public", 50000);
            original.setHireDay(2000, 1, 1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 13);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
