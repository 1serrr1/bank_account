package org.example;


public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Семен", 1233, 1100, 7.5);

        account.deposit(500);
        account.deposit(600);
        account.deposit(700);

        account.withdraw(700);
        account.withdraw(600);
        account.withdraw(100);

        account.printAccountSummary();
    }
}