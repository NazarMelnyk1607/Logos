package com.logos.Lesson_9.bank;

public class Main {
    public static void main(String[] args) throws NoMoneyException {

        BankAccount bankAccount = new BankAccount();

        bankAccount.makeDeposit(1000);
        bankAccount.withdrawMoney(200);
        bankAccount.withdrawMoney(900);
    }
}
