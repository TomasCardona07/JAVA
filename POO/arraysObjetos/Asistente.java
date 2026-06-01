package arraysObjetos;
//Se crea lista en la EPS, se registran 5 personas y al final se muestran los mayores de edad
public class Asistente {
    String name;
    int age;
    Asistente(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Asistente asistente1 = new Asistente("Tomas", 17);
        Asistente asistente2 = new Asistente("Pablo", 15);
        Asistente asistente3 = new Asistente("Carlos", 20);
        Asistente asistente4 = new Asistente("Marta", 43);
        Asistente asistente5 = new Asistente("Diego", 39);
        Asistente asistentes [] = {asistente1,asistente2,asistente3,asistente4,asistente5};
        int legalAge = 0;
        for (int i = 0; i < asistentes.length; i++){
            if (asistentes[i].age >= 18){
                legalAge++;
            }
        }
        System.out.println(legalAge + " adults"  );
    }
}
