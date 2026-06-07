package encapsulación;

public class Thermometer {
    //Atributos
    private int temperature;

    //Constructor
    Thermometer(int temperature){
        this.temperature = temperature;
    }

    //obtener temperatura de la clase privada
    public int getTemperature(){
        return temperature;
    }

    //mostrar temperatura
    public void showTemperature(){
        System.out.println("Temperature: " + temperature);
    }

    //sumar temperatura usando setter
    public void setTemperaturePlus(int change){
        temperature += change;
    }

    //Restar temperatura usando setter, la temperatura no puede ser menor a 273
    public void setTemperatureMinus(int change){
        temperature -= change;
        if (temperature < -273) {
            System.out.println("Temperature cannot be minus than 273");
            temperature += change;
        }
    }

    //MAIN
    public static void main(String[] args) {
        Thermometer temperatura = new Thermometer(100);
        temperatura.showTemperature();
        temperatura.setTemperaturePlus(200);
        temperatura.showTemperature();
        temperatura.setTemperatureMinus(400);
        temperatura.showTemperature();

    }
}
