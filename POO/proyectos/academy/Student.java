package proyectos.academy;
import java.util.Scanner;

public class Student {

    //=====Atributos=====
    String name;
    double score;
    int age;

    //======= CONSTRUCTOR =======   
    Student(String name, double score, int age){
        this.name = name;
        this.score = score;
        this.age = age;
    }

    // ======= RECIBIR NOMBRE DEL ALUMNO ==========
    public static String nameStudent(Scanner src){
        String name = src.nextLine().toLowerCase();
        return name;
    }


    //======= RECIBIR NOTA DEL ALUMNO ==========
    public static double scoreStudent(Scanner src){
        double score = Double.parseDouble(src.nextLine());
        while ((score > 100) || (score < 0)) {
            System.out.println("Score incorrect");
            System.out.println("Enter score again please");
            score = Double.parseDouble(src.nextLine());
        }
        return score;
    }
    

    // ======== RECIBIR EDAD DEL ALUMNO ==========
    public static int ageStudent(Scanner src){
        int age = Integer.parseInt(src.nextLine());
        while (age < 0) {
            System.out.println("age incorrect");
            System.out.println("Enter age again please");
            age = Integer.parseInt(src.nextLine());
        }
        return age;
    }
}
