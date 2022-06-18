package Lesson8.Lesson8;

public class Test {
    public final int A = 10;

    Test () {
    }

    Test (boolean b) {
    }

    public void abc (final short s) {
        final byte b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.A = 10;
        System.out.println(t.A);
    }
}