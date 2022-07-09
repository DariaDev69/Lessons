package Lesson11.Homework;

public class Car {
    String color;
    String engine;
    int doors;

    Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class CarTest {

    public static void changeDoors (Car localObject, int doors) {
        localObject.doors = doors;
    }

    public static void changeParametrOfColor (Car local1, Car local2) {
        String color = local1.color;
        local1.color = local2.color;
        local2.color = color;
    }

    public static void main(String[] args) {

        CarTest ct = new CarTest();
        Car c1 = new Car ("red", "v6", 6);
        Car c2 = new Car("black", "v4", 4);
        ct.changeDoors(c1,80);
        ct.changeDoors(c2,100);
        ct.changeParametrOfColor(c1,c2);

        System.out.println("Test methods:");
        System.out.println("Car 1:" + c1.color + ", " + c1.engine + ", " + c1.doors);
        System.out.println("Car 2:" + c2.color + ", " + c2.engine + ", " + c2.doors);
    }
}