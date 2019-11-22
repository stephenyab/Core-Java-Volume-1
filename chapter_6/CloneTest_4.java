package Core_Java_Volume_1.chapter_6;

public class CloneTest_4 {
    public static void main(String[] args) {
        try{
            Employee_5 original=new Employee_5("John Q. Public",50000);
            original.setHireDay(2000,1,1);
            Employee_5 copy=original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002,12,31);
            System.out.println("original="+original);
            System.out.println("copy="+copy);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
