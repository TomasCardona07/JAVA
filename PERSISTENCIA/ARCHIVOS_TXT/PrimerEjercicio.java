package PERSISTENCIA.archivos_txt;

import java.io.File;
import java.io.FileWriter;

public class PrimerEjercicio {
    public static void main(String[] args) {
        try {
            File papel = new File("notas.txt");
            FileWriter lapiz = new FileWriter(papel);
            lapiz.write("Hola, soy Tomi \n");
            lapiz.write("Estoy aprendiendo persistencia\n");
            lapiz.write("Estoy empezando con archivos de texto :)");
            lapiz.close();
        } catch (Exception e) {
            System.err.println("FALLÓ ESTA VUELTA");
        }
        // Pendiente: Aprender a leer archivos y crear objetos nuevamente
    }
}
