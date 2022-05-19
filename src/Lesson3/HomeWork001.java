package Lesson3;

public class HomeWork001 {
    public static void main (String[] args) {
       /* Домашняя работа.

        Задание 1.
        Вычислить следующую часть кода:
       */
        int i1=5;
        int i2=11;
        double d1=5.5;
        double d2=1.3;
        long l=20l;
        double result=0;
        result=i2/d1+d2%i1-l;
        System.out.println(result);

        /* Задание 2.
        Вычислить выражения:
        1. a-- - --a + ++a + a++ +a
        2. ++b - b++ + ++b - --b
        если а=5 и b=8
         */
        int a=5;
        int b=8;
        System.out.println(a-- - --a + ++a + a++ + a);
        System.out.println(++b - b++ + ++b - --b);
    }
}
