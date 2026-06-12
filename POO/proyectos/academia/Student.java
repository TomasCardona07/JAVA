package proyectos.academia;
import java.util.Scanner;

public class Student {
    Scanner src = new Scanner(System.in);
    String name;
    double score;
    int age;
    Student(String name, double score, int age){
        this.name = name;
        this.score = score;
        this.age = age;
    }

    // ======= RECIBIR NOMBRE DEL ALUMNO ==========
    public static String nameStudent(Scanner src){
        System.out.println("Enter student's name");
        String name = src.nextLine();
        return name;
    }


    //======= RECIBIR NOTA DEL ALUMNO ==========
    public static double scoreStudent(Scanner src){
        System.out.println("Enter score's student");
        double score = Double.parseDouble(src.nextLine());
        while ((score > 100) || (score < 0)) {
            System.out.println("Score incorrect");
            System.out.println("Enter score again please");
            score = Double.parseDouble(src.nextLine());
        }
        return score;
    }
    

    // ========RECIBIR EDAD DEL ALUMNO ==========
    public static int ageStudent(Scanner src){
        System.out.println("Enter age's student");
        int age = Integer.parseInt(src.nextLine());
        while (age < 0) {
            System.out.println("age");
            System.out.println("Enter age again please");
            age = Integer.parseInt(src.nextLine());
        }
        return age;
    }
}
