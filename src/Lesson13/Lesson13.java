package Lesson13; //пример использования if-else и switch в сравнении.

public class Lesson13 {
}

class Student {
    int grade;

    Student (int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);
        if (st1.grade == 2) {
            System.out.println("Student dvoechnick.");
        }
        else if (st1.grade == 3) {
            System.out.println("Student troechnick.");
        }
        else if (st1.grade == 4) {
            System.out.println("Student horoshist.");
        }
        else if (st1.grade == 5) {
            System.out.println("Student otlichnick.");
        }
        else {
            System.out.println("Ocenka ne verna.");
        }

        switch (st1.grade) {
            case 2:
                System.out.println("Student dvoechnick.");
                break;
            case 3:
                System.out.println("Student troechnick.");
                break;
            case 4:
                System.out.println("Student horoshist.");
                break;
            case 5:
                System.out.println("Student otlichnick.");
                break;
            default:
                System.out.println("Ocenka ne verna.");
        }
    }
}