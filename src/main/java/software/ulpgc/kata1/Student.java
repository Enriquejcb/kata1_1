package software.ulpgc.kata1;
import java.time.LocalDate;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYearBirth() {
        int thisYear = LocalDate.now().getYear();
        return thisYear - this.getAge();
    }
}
