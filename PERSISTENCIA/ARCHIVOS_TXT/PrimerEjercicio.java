package PERSISTENCIA.ARCHIVOS_TXT;

import java.io.File;
import java.io.FileWriter;

public class PrimerEjercicio {
    public static void main(String[] args) {
        try {
            File papel = new File("notas.txt");
            FileWriter lapiz = new FileWriter(papel);
            lapiz.write("Hola, soy Tomi \n");
            lapiz.write("Estoy aprendiendo persistencia");
            lapiz.close();
        } catch (Exception e) {
            System.err.println("FALLÓ ESTA VUELTA");
        }
    }
}
