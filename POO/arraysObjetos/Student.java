package arraysObjetos;
//Universidad registro 3 estudiantes nuevos, al final se muestran los nombres y edad de cada uno
public class Student {
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Student student1 = new Student("Tomas", 20);
        Student student2 = new Student("Juan", 22);
        Student student3 = new Student("Ana", 19);
        Student[] students = {student1,student2,student3};
        for (int i = 0; i < students.length; i++){
            System.out.print(students[i].name);
            System.out.println(" - " + students[i].age);
        }
    }
}
