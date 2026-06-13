package proyectos.academy;

import java.util.Scanner; //Importar Scanner
import java.util.ArrayList; //Importar Arrays


public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in); //Crear Scanner
        ArrayList<Student> students = new ArrayList<>(); //Crear array de estudiantes

        //====== ATRIBUTOS PARA ASIGNAR =======
        String name;
        int age;
        double score;
        double highestScore = -1;
        String nameHighest = "n";
        int older = 0;
        String nameOlder = "n";
        int younger = 999;
        String nameYounger = "n";
        double average = 0;
        int aprStudents = 0;
        int failStudents = 0;

        // ========== SOLCITAR NUMERO DE ESTUDIANTES ==============
        System.out.println("¿how many students do you want to add?");
        int numStudents = Integer.parseInt(src.nextLine());
        while (numStudents <= 0) {
            System.out.println("Number incorrect, please enter number again");
            numStudents = Integer.parseInt(src.nextLine());
        }


        // ============== INGRESO DE DATOS DE CADA ESTUDIANTE ==============
        for (int i = 0; i < numStudents; i++){
            System.out.println("Enter the name of " + (i+1) + " student");
            name = Student.nameStudent(src);
            System.out.println("Enter the age of " + (i+1) + " student");
            age = Student.ageStudent(src);
            System.out.println("Enter the score of " + (i+1) + " student");
            score = Student.scoreStudent(src);
            Student student = new Student(name, score, age);
            students.add(student);
        }


        // ======== ALMACENAR REQUISITOS =============
        for (Student student : students){
            if (student.score > highestScore) {
                highestScore = student.score;
                nameHighest = student.name;
            }
            if (student.age > older) {
                older = student.age;
                nameOlder = student.name;
            }
            if (student.age < younger) {
                younger = student.age;
                nameYounger = student.name;
            }
            if (student.score >= 60) {
                aprStudents++;
            }
            else{
                failStudents++;
            }
            average += student.score;
        }
        average /= students.size();
        System.out.println("registered students: " + students.size()); //Estudiantes registrados


        // ========= BUSQUEDA DE ESTUDIANTE ===========
        System.out.println("Are you looking for a specific student?");
        System.out.println("YES = 'Y'          NO = 'N'");
        String lookingStudent = src.nextLine().toUpperCase();
        while (!lookingStudent.startsWith("Y") && !lookingStudent.startsWith("N")) {
            System.out.println("Invalid data, please enter the data again");
            lookingStudent = src.nextLine().toUpperCase();
        }
        if (lookingStudent.startsWith("Y")) {
            System.out.println("Enter name of the student you wanto search for");
            String findStudent = src.nextLine().toLowerCase();
            Boolean studentFound = false;
            for (int i = 0; i < students.size(); i++){
                if (students.get(i).name.equals(findStudent)) {
                    System.out.println("Student found!!");
                    System.out.println("Name: " + students.get(i).name);
                    System.out.println("Age: " + students.get(i).age);
                    System.out.println("Score: " + students.get(i).score);
                    studentFound = true;
                    break;
                }
            }
            if (studentFound == false) {
            System.out.println("Student not found");
            }
        }
    


        // ========= MOSTRAR DATOS DE TODOS LOS ALUMNOS ===========
        System.out.println("STUDENT'S LIST:");
        for (int i = 0; i < students.size(); i++){
            students.get(i);
            System.out.println("Name of the " + (i+1) + " student: " + students.get(i).name);
            System.out.println(students.get(i).name + "'s score: " + students.get(i).score);
            System.out.println(students.get(i).name + "'s age: " + students.get(i).age);
            System.out.println("==============================");
        }

        //========== SALIDAS ============
        System.out.println("Best student:");
        System.out.println(nameHighest + " - Score: " + highestScore);
        System.out.println("=====================");
        System.out.println("Younger student:");
        System.out.println(nameYounger + " - age: " + younger);
        System.out.println("=====================");
        System.out.println("Older student:");
        System.out.println(nameOlder + " - age: " + older);
        System.out.println("=====================");
        System.out.println("Gropu average: " + average );
        System.out.println("Approbated: " + aprStudents);
        System.out.println("Failed: " + failStudents);
        src.close();
    }
}
