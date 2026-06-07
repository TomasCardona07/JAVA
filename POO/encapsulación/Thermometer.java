package encapsulación;

public class Thermometer {
    private int temperature;

    Thermometer(int temperature){
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
    public void showTemperature(){
        System.out.println("Temperature: " + temperature);
    }
    public void setTemperaturePlus(int change){
        temperature += change;
    }
    public void setTemperatureMinus(int change){
        temperature -= change;
        if (temperature < -273) {
            System.out.println("Temperature cannot be minus than 273");
            temperature += change;
        }
    }
    public static void main(String[] args) {
        Thermometer temperatura = new Thermometer(100);
        temperatura.showTemperature();
        temperatura.setTemperaturePlus(200);
        temperatura.showTemperature();
        temperatura.setTemperatureMinus(400);
        temperatura.showTemperature();

    }
}
