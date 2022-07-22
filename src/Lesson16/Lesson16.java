package Lesson16;

public class Lesson16 {}

class Test1 { // тест методов класса String
    public static void main(String[] args) {
        String s1 = new String("Privet");

        int a = s1.length(); // Метод length()
        System.out.println(a);

        char c1 = s1.charAt(10); // Метод charAt(int index)
        // !!! если параметр метода charAt(int index) это номер индекса, значения которого нет, например, в данном случае 10, то output метода выдаст не совсем ошибку,
        /// а Exception (исключение).
        System.out.println(c1);
    }
}
