package Lesson12.HomeWork;

class Student {
    String name;
    int course;
    double grade;

    Student (String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}

public class StudentTest {

    static void comparison (Student local1, Student local2) {
        if (local1.name.equals(local2.name) && local1.course == local2.course && local1.grade == local2.grade) {
            System.out.println("The students are identical.");
        }
        else {
            System.out.println("The students aren't identical.");
        }
    }

    static void comparison2 (Student local1, Student local2) {
        if (local1.name.equals(local2.name)) {
            if (local1.course == local2.course) {
                if (local1.grade == local2.grade) {
                    System.out.println("The students are identical.");
                }   else {
                    System.out.println("The students have identical names, courses, but different grades");
                }
            }
            else {
                System.out.println("The students have identical names, but different courses");
            }
        }
        else {
            System.out.println("The students have different names");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Daria", 2, 4.5);
        Student s2 = new Student("Masha", 2, 4.5);

        comparison(s1,s2);
        comparison2(s1,s2);
    }
}