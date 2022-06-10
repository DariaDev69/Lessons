package Lesson6;
// Перегрузка методов и конструкторов. Ключевое слово this.
public class MethodOverloading {

    void show (int i1) {
        System.out.println(i1);
    }

    void show (boolean b1) {
        System.out.println(b1);
    }

    void show (String s1) {
        System.out.println(s1);
    }
}
/*
Методы с одинаковым действием можно назвать одинаково, но в этом случае:
1. Методы должны отличаться параметрами (разные по типу данных, разные по количеству параметров, разные по порядку параметров).
2. Return type может быть одинаковым или различаться.
3. Access modifier может быть одинаковым или различаться.
НО! методы, которые отличаются только по Return types и Access modifiers не являются overloading.

Конструкторы также могуть быть overloading.
Используйте this на первой строке в теле для вызова overloaded конструктора внутри конструктора.

*/