package software.ulpgc.kata1;

public class main {
    void main(String[] args) {
        Student alvaro = new Student("Alvaro", 10);
        int age = alvaro.getYearBirth();
        System.out.println(age);
    }
}
