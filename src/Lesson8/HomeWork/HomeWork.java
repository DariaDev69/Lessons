package Lesson8.HomeWork;

public class HomeWork {

    static final double P = 3.14;

    public double ploshadKruga (double radius) {
        return P*radius*radius;
    }

    public static double dlinaKruga (double radius) {
        return P * 2 * radius;
    }

    public void getInfo (double radius) {
        System.out.println("Ploshad kruga = " + P*radius*radius);
        System.out.println("Dlina kruga = " + P*radius*2);
        System.out.println(radius);
    }

    public static int proizv(int a, int b, int c) {
        return a*b*c;
    }

    public static void proizvDva (int a, int b, int c) {
        System.out.println("1: " + a/b + "\n2: " + a%b);
    }
}