package Lesson5;

public class Lesson5 {}
/*    Метод. Создание и вызов метода.
        Методы - функции, существующие в классе, и описывающие инстукции о действиях с параметрами (переменными).
        Input метода переменные, далее Метод (черный ящик) выполняет заявленные с переменными дейсвтя, далее output метода это Result, такой как описано в методе в строке return.
        Пример метода:
        На примере основного метода Main:
public static void main (String [] args) {...}
public - acsess modifier; об этом в урок позже
static - non-acsess  modifier(s); об этом в уроках позже
        !Это НЕобязательные элементы в структуре метода!
        void - return type, т.е. то что возвращает нам метод/его output. void - значит "пустота", пишется когда мы не хотим выводить ничего и  конкретный тип данных.
        main - имя метода
        () - в скобках располагаются параметры метода !!Обязательный пункт, но внутри параменты писать не обязательно
        {} - тело метода, т.е. сам код, описывающий функциональность метода.*/
class Test {
    int summa (int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}
class Test1 {
    public static void main (String [] args) {
        Test t = new Test();
        int summaTrehChisel = t.summa (1, 2, 3);
        System.out.println (summaTrehChisel);
    }
}


// ПРИМЕР:

class Car2 {
    String color;
    String engine;
    int speed;

    int gaz (int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz (int skorost) {
        speed -= skorost;
        return speed;
    }

    void showinfo () {
        System.out.println ("cvet: " + color);
        System.out.println ("motor: " + engine);
        System.out.println ("skorost: " + speed);
    }
}

class Car2Test {
    public static void main (String [] args) {
        Car2 c1 = new Car2 ();
        c1.color = "white";
        c1.engine = "V6";
        c1.speed = 60;
        c1.showinfo ();
        c1.gaz (20);
        c1.showinfo ();
        c1.tormoz (80);
        c1.showinfo ();
    }
}
// LIFO - Last In, First Out.

/* Конструкторы есть в каждом классе. При этом он служит для создания объекта класса.
Конструктор всегда называется также как Класс!!!
Виды конструкторов:
1. Дефолтный - создается в каждом классе автоматически, если мы не создаем конструктор вручную.
Он всегда не имеет никаких параметров и его тело пустое.
2. Созданный вручную. Тогда дефолтный не создается. Он может иметь параметры и код в теле, а может быть пустым.
Отличие метода от констуктора:
1. Метод всегда имеет возвратное значение, а если ничего не надо возвращать, то мы ставим void.
Конструктор никогда не имеет возвратного значения.
2. Для метода можно придумать бесконечное разнообразие имен.
Имя конструктора должно совпадать с именем класса.

 */