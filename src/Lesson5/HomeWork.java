package Lesson5;

public class HomeWork {
   /*
   1. В класс BankAccountT добавьте 2 метода.
   Первый называется popolnenieScheta и увеличивает баланс на сумму, которая указана в параметре этого метода.
   Второй называется snyatieSoScheta и уменьшает баланс на сумму, которая указана в параметре этого метода.
   */
}

class BankAccountT {
    int id = 10;
    String name = "Petr";
    double balance = 100;

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
        BankAccountT MyAccount = new BankAccountT();

        MyAccount.popolnenieScheta(150.5);
        MyAccount.snyatieSoScheta(60.8);
    }
}