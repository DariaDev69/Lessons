package Lesson5;

public class HomeWork {}
   /*
   1. В класс BankAccountT добавьте 2 метода.
   Первый называется popolnenieScheta и увеличивает баланс на сумму, которая указана в параметре этого метода.
   Второй называется snyatieSoScheta и уменьшает баланс на сумму, которая указана в параметре этого метода.
   */
class BankAccountT {
    int id;
    String name;
    double balance;

    BankAccountT (int userId, String userName, double userBalance){
        id = userId;
        name = userName;
        balance = userBalance;
    }
    void popolnenieScheta (double summaPopolneniya) {
        balance += summaPopolneniya;
        System.out.println(balance);
    }

    void snyatieSoScheta (double summaSpisania) {
        balance -= summaSpisania;
        System.out.println(balance);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccountT myBankAccount = new BankAccountT(24041994, "Daria", 1899.9);
        myBankAccount.popolnenieScheta(148.08);
        myBankAccount.snyatieSoScheta(150);
    }
}

//  2. Измените класс StudentTest так, чтобы среднюю арифметическую оценку студента выводил на экран метод.
class Student {
    int nomerBileta;
    String name;
    String familiya;
    int godObucheniya;
    double middleMarkMath;
    double middleMarkEconomic;
    double middleMarkLanguage;

    double middleMark () {
        double middleMark = (middleMarkMath + middleMarkEconomic + middleMarkLanguage) / 3;
        return middleMark;
    }
}

class StudentTest {
    public static void main(String[] args) {

        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Student3 = new Student();

        Student1.nomerBileta = 169;
        Student1.name = "Dasha";
        Student1.familiya = "Dubrovina";
        Student1.godObucheniya = 2012;
        Student1.middleMarkMath = 4.75;
        Student1.middleMarkEconomic = 3.90;
        Student1.middleMarkLanguage = 5.00;
        Student1.middleMark();

        Student2.nomerBileta = 150;
        Student2.name = "Sasha";
        Student2.familiya = "Dubrovin";
        Student2.godObucheniya = 2010;
        Student2.middleMarkMath = 5.00;
        Student2.middleMarkEconomic = 4.90;
        Student2.middleMarkLanguage = 3.00;
        Student2.middleMark();

        Student3.nomerBileta = 697;
        Student3.name = "Olga";
        Student3.familiya = "Dubrovina";
        Student3.godObucheniya = 2010;
        Student3.middleMarkMath = 4.00;
        Student3.middleMarkEconomic = 3.75;
        Student3.middleMarkLanguage = 5.00;
        Student3.middleMark();

        System.out.println("Middle mark of Student1: " + Student1.middleMark());
        System.out.println("Middle mark of Student2: " + Student2.middleMark());
        System.out.println("Middle mark of Student3: " + Student3.middleMark());
    }
}
/*
     3. Создайте класс Employee с атрибутами id, surname, age, salary, department, которые должны задаваться в конструкторе.
    В данном классе создайте метод увеличения зп вдвое.
    Создайте 2й класс EmployeeTest , в котором создайте 2 объекта класса Employee.
    Увеличьте зп каждому работнику вдвое с помощью метода и выведите на экран новую величину зп.
*/
class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    Employee (int empId, String empSurname, int empAge, int empSalary, String empDepartment) {
   id = empId;
   surname = empSurname;
   age = empAge;
   salary = empSalary;
   department = empDepartment;
    }
    int doubleSalaryIncrease () {
        salary *= 2;
        return salary;
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee (1, "Dubrovina", 28, 60000, "PHITO");
        Employee employee2 = new Employee (2, "Ivanova", 32, 70000, "PHITO");
        employee1.doubleSalaryIncrease();
        System.out.println(employee1.surname + "'s salary increased! New salary is " + employee1.salary);
        employee2.doubleSalaryIncrease();
        System.out.println(employee2.surname + "'s salary increased! New salary is " + employee2.salary);
    }
}
