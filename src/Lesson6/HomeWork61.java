package Lesson6;
/*
2. Измените класс Student так, чтобы он имел 3 конструктора.
1й принимает все параметры.
2й только id, name, surname, course.
3й не принимает значений.
Создаёте в классе StudentTest 3 обьекта с помощью разных конструкторов.
*/
public class HomeWork61 {}

class Student {
    int id;
    String name;
    String surname;
    int course;
    double middleMarkMath;
    double middleMarkEconomic;
    double middleMarkLanguage;

    Student (int id1, String name1, String surname1, int course1, double middleMarkMath1, double middleMarkEconomic1, double middleMarkLanguage1) {
        id = id1;
        name = name1;
        surname = surname1;
        course = course1;
        middleMarkMath = middleMarkMath1;
        middleMarkEconomic = middleMarkEconomic1;
        middleMarkLanguage = middleMarkLanguage1;
    }
    Student (int id2, String name2, String surname2, int course2) {
        this(id2, name2, surname2, course2, 0.0, 0.0, 0.0);
    }
    Student () {}
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(1,"Daria","Dubrovina",1,4.5,4.6,4.75);

        Student st2 = new Student(2,"Sasha","Dubrovin",1);
        st2.middleMarkMath = 4.5;
        st2.middleMarkEconomic = 4.75;
        st2.middleMarkLanguage = 5.0;

        Student st3 = new Student();
        st3.id = 3;
        st3.name = "Olga";
        st3.surname = "Dubrovina";
        st3.course = 1;
        st3.middleMarkMath = 4.5;
        st3.middleMarkEconomic = 4.0;
        st3.middleMarkLanguage = 5.0;
    }
}