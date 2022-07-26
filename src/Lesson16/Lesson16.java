package Lesson16;

public class Lesson16 {}
class Test1 { // тест методов класса String
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        int a = s1.length(); // Метод length()
        System.out.println(a);
        char c1 = s1.charAt(1); // Метод charAt(int index)
        // !!! если параметр метода charAt(int index) это номер индекса, значения которого нет, например, в данном случае 10, то output метода выдаст не совсем ошибку,
        /// а Exception (исключение).
        System.out.println(c1);
        int i1 = s1.indexOf('t'); // Метод indexOf(char c)
        System.out.println(i1);
        int i2 = s1.indexOf("vet"); // Метод indexOf(String s) - покажет индекс до первого символа, который совпадает, т.е. в данном случае v с индексом 3.
        // Если в параметр ввести char или String, которого не существует, то output всегда будет индекс -1.
        System.out.println(i2);
        int i3 = s1.indexOf('a', 5); // Метод indexOf(char c, fromIndex ) - покажет индекс определенного char или String, но не с индекса 0, а с другого, в примере с индекса 5.
        System.out.println(i3);
        boolean i4 = s1.startsWith("abc"); // Метод startsWith (String prefix) - показывает начинается ли s1 с "abc" (ответ true или false).
        System.out.println(i4);
        boolean i5 = s1.startsWith("abc", 7); // Метод startsWith (String prefix, int from) - показывает начинается ли s1 с "abc", но проверка начиная не с индекса 0, а с индекса 7 в примере (ответ true или false).
        System.out.println(i5);
        boolean i6 = s1.endsWith("abc"); // Метод endsWith (String suffix) - показывает заканчивается ли s1 на "abc" (ответ true или false).
        System.out.println(i6);
    }
}
class Test2 {
    public static void main(String[] args) {
        String s1 = new String("Privet");
        String s10 = s1.substring(3); // Метод substring (int beginindex), с помощью которого мы смотрим кусок строки String, начиная с 3-го индекса.
        System.out.println(s10);
        String s11 = s1.substring(3,7); // Метод substring (int beginindex, int endindex), с помощью которого мы смотрим кусок строки String, начиная с 3-го индекса по 6-й индекс включительно.
        //!!! указанный в параметрах 7-й индекс не учитывается.
        System.out.println(s11);
        String s12 = s1.trim(); // Метод trim()
        System.out.println(s12);
        String s13 = s1.trim(); // Метод trim()
        System.out.println(s13);
        String s14 = s1.replace('o', 'Z'); // Метод replace (char oldChar, char newChar).
        System.out.println(s14); // если ввести oldChar или  oldString, которого в String s1 не существует, тогда jvm росто выведет s14, который будет равен s1, без изменений.
        String s15 = s1.replace("vet", "Zvet"); // Метод replace (String oldString, String newString)
        System.out.println(s15);
        String s5 = "Privet,";
        String s6 = "drug";
        System.out.println(s5.concat(s6)); // Метод concat (String str).
        String s7 = s1.toLowerCase(); // Метод toLowerCase ().
        System.out.println(s7);
        boolean s8 = s1.contains("T:2"); // Метод contains (String str).
        System.out.println(s8);
    }
}
class Test3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String s = "ok";
        System.out.println(a+b+s); // output будет 11ok , т.к. первый + будет как сложение, а второй как знак конкатенации.
        System.out.println("" + a + b +s); // исправить строку выше можно добавив пустые "".
    }
}
class Test4 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "URA-a-a";
        String s3 = s1.concat(s2).trim().replace("URA-a-a", "Ura").substring(6,10); // Это называется цепочкой методов.
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
/*class Test5 {
    public static void main(String[] args) {
        String s1 = "Чтоб мудро жизнь прожить,знать надобно немало,Два важных правила запомни для начала:" +
                "Ты лучше голодай,чем что попало есть,И лучше будь один,чем вместе с кем попало.";
        System.out.println(s1);
        String s2 = s1.toUpperCase();
        char c1;
        char c2;

        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}*/
class Test6 {
    public static void main(String[] args) {
        String s1 = "Privet"; // метод isBlank().
        System.out.println(s1.isBlank());
        String s2 = "      "; // метод isBlank().
        System.out.println(s2.isBlank());

        String s4 = "    privet     ";
        System.out.println(s4.strip());
    }
}