package Lesson17;

class Car {}

public class Lesson17 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder ();
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder (50);
        StringBuilder sb4 = new StringBuilder (sb3);

        System.out.println(sb2.subSequence(5, 8));

        //sb2.append(22); // пример метода append(dataType dt).
        //System.out.println(sb2);
        //sb2.append(sb2);
        //System.out.println(sb2);
        //sb2.append(new Car ());
        //System.out.println(sb2);

        //System.out.println(sb2.insert(sb2.length(), 55)); // пример метода insert(int toIndex, dataType dt).

        StringBuilder sb10 = new StringBuilder("Hello World"); // пример метода delete (int start, int end).
        //sb10.delete(3,6);
        //System.out.println(sb10);

        //sb10.deleteCharAt(6); // пример метода deleteCharAt (int index).
        //System.out.println(sb10);

        StringBuilder sb12 = new StringBuilder("Vsem privet!"); // пример метода replace(int start, int end, String s).
        sb12.replace(0,6,"Pete");
        System.out.println(sb12);
    }
}

class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello, friend!");
        String s = null;
        s = sb1.append("How are you?").substring(sb1.indexOf ("f"), sb1.indexOf("!"));
        System.out.println(s);
    }
}