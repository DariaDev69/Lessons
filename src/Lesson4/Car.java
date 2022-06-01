package Lesson4;

public class Car {

    void Car (String cvet, String motor) {
    color = cvet;
    engine = motor;
        System.out.println("Cvet mashin:" + color);
        System.out.println("Motor mashin:" + engine);
    }
    String color;
    String engine;
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();


        Car car2 = new Car();

    }
}