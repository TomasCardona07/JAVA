package proyectos.academia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = Student.nameStudent();
        Double score = Student.scoreStudent();
        int age = Student.ageStudent();
        Student student1 = new Student(name, score, age);
    }
}
