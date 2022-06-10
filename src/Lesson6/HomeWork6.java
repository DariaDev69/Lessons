package Lesson6;

/*
1. Создайте класс, в котором будут 5 overloaded методов, которые вычисляют сумму нуля, одного, двух, трёх и четырёх целых
чисел соответственно, передают эту сумму в output и выводят ее на экран. В случае, когда слагаемые отсутствуют, то сумма
пусть равняется нулю.
 */
public class HomeWork6 {
    int sum (int a2, int b2, int c2, int d2) {
        int sum2 = a2+b2+c2+d2;
        System.out.println(sum2);
        return sum2;
    }
    int sum (int a3, int b3, int c3) {
        int sum3 = a3+b3+c3;
        System.out.println(sum3);
        return sum3;
    }
    int sum (int a4, int b4) {
        int sum4 = a4+b4;
        System.out.println(sum4);
        return sum4;
    }
    int sum (int a5) {
        int sum5 = a5;
        System.out.println(sum5);
        return sum5;
    }
    int sum () {
        int sum6 = 0;
        System.out.println(sum6);
        return sum6;
    }
}

class TestFromLesson6 {
    public static void main(String[] args) {
        HomeWork6 test = new HomeWork6 ();
        test.sum ();
        test.sum (1);
        test.sum (1,2);
        test.sum (1,2,3);
        test.sum (1,2,3,4);
    }
}