package software.ulpgc.kata1;
import java.time.LocalDate;

public record Student(String name, int age) {

    public int getYearBirth() {
        int thisYear = LocalDate.now().getYear();
        return thisYear - this.age();
    }
}
