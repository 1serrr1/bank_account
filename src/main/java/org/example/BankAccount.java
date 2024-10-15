package org.example;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String ownerName;
    private int id;
    private double balance;
    private double annualInterestRate;
    private List<Transaction> transactions;

    public BankAccount(String ownerName, int id, double balance, double annualInterestRate) {
        this.ownerName = ownerName;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Пополнение", amount));
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Вывод", amount));
        } else {
            System.out.println("Недостаточный баланс для вывода средств.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void printAccountSummary() {
        System.out.println("Account Summary:");
        System.out.println("Владелец: " + ownerName);
        System.out.println("Account ID: " + id);
        System.out.println("Баланс: " + balance + " RUB");
        System.out.println("Годовая процентная ставка: " + annualInterestRate + "%");
        System.out.println("Операции:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
