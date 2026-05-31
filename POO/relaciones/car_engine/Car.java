package relaciones.car_engine;

public class Car {
    String brand;
    Engine engine;
    Car(String brand, Engine engine){
        this.brand = brand;
        this.engine = engine;
    }
    void showInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Engine: " + engine.type);
        System.out.println("Horsepower: " + engine.horsepower);
    }
    public static void main(String[] args) {
        Engine engine1 = new Engine("Gasoline", 150);
        Car car1 = new Car("Toyota", engine1);
        car1.showInfo();
    }
}
