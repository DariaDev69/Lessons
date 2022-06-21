package Lesson8.Lesson8;

public class Test {
    public final int A = 10; // константа инициализируется сразу или к=в конструкторе

    Test () {
    }

    Test (boolean b) {
    }

    public void abc (final short s) {
        final byte b = 10; // это локальная константа (только в методе)
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test t = new Test();
        // t.A = 10; // компилятор выдаст ошибку, т.к. константу нельзя инициализировать повторно, даже на то же самое значение.
        System.out.println(t.A);
    }
}

class Car {
    String color = "blue";
    String engine = "v6";
}

class Human{
    String name = "Ivan";
    Car c = new Car ();

    public static void main(String[] args) { // пример, как мы можем человеку h1 создавать новых машины каждый раз, пока переменная c не final.
        Human h1 = new Human();
        h1.c = new Car ();
        h1.c = new Car ();
        h1.c.engine = "V8";
    }
}