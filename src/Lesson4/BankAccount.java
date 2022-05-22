package Lesson4;

public class BankAccount {
// эти переменные будут относиться к каждому созданному объекту внутри класса
    int id;
    String name;
    // можно записать как String name = new String ("значение");
    double balance;

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
    /* Создание объекта.
    BankAccount - это имя класса BankAccount, т.к. класс в Java это ссылочный тип данных переменной.
    MyAccount - имя переменной.
    new BankAccount() - значение переменной, в данном случае это вызов конструктора - создание объекта.
    За словом new всегда следует конструкция подобная BankAccount(), это значит, что сейчас будет создаваться новый
    объект, т.е. в данном случае объект класса BankAccount.
     */
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="Daria";
        MyAccount.balance=12.35;

        YourAccount.id=2;
        YourAccount.name="Mike";
        YourAccount.balance=2.00;

        HisAccount.id=3;
        HisAccount.name="Ivan";
        HisAccount.balance=124.12;

        System.out.println(MyAccount.id);

    }
}