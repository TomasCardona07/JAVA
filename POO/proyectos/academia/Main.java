package proyectos.academia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String name = Student.nameStudent(src); 
        Double score = Student.scoreStudent(src);
        int age = Student.ageStudent(src);
        Student student1 = new Student(name, score, age);
        System.out.println(student1.name);
        System.out.println(student1.score);
        System.out.println(student1.age);
        src.close();
    }
}
