package Lesson4;

public class HomeWork {
   /* 1. Создайте 2 класса. 1й назовите Student. Он должен содержать в себе следующие атрибуты: номер студенческого билета,
    имя, фамилию, год обучения, средняя оценка по математике. средняя оценка по экономике, средняя оценка по иностранному
    языку. 2й класс назовите StudentTest. В нем создайте 3 разных обьекта класса Student, вывести на экран в читабельном
    виде среднюю арифметическую оценку каждого студента (учитывая все 3 предмета).*/
}

class Student {
        int nomerBileta;
        String name;
        String familiya;
        int godObucheniya;
        double middleMarkMath;
        double middleMarkEconomic;
        double middleMarkLanguage;
}

class StudentTest {
    public static void main(String[] args) {

        Student Student1 = new Student ();
        Student Student2 = new Student ();
        Student Student3 = new Student ();

        Student1.nomerBileta = 169;
        Student1.name = "Dasha";
        Student1.familiya = "Dubrovina";
        Student1.godObucheniya = 2012;
        Student1.middleMarkMath = 4.75;
        Student1.middleMarkEconomic = 3.90;
        Student1.middleMarkLanguage = 5.00;

        Student2.nomerBileta = 150;
        Student2.name = "Sasha";
        Student2.familiya = "Dubrovin";
        Student2.godObucheniya = 2010;
        Student2.middleMarkMath = 5.00;
        Student2.middleMarkEconomic = 4.90;
        Student2.middleMarkLanguage = 3.00;

        Student3.nomerBileta = 697;
        Student3.name = "Olga";
        Student3.familiya = "Dubrovina";
        Student3.godObucheniya = 2010;
        Student3.middleMarkMath = 4.00;
        Student3.middleMarkEconomic = 3.75;
        Student3.middleMarkLanguage = 5.00;

        System.out.println("Middle mark of Student1: ");
        System.out.println("Middle mark of Student2: ");
        System.out.println("Middle mark of Student3: ");
    }
}