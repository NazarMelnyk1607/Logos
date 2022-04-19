package com.logos.Lesson_9.bank;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
        System.out.println("Thanks for creating account");
        System.out.println("Now you have balance " + this.balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void makeDeposit(double amount){
        balance += amount;
        System.out.println("Added amount " + amount + " and now you balance = " + balance);
    }

    public void withdrawMoney(double amount) throws NoMoneyException {
        if(amount < balance){
            balance -= amount;
            System.out.println("withdraw amount " + amount + " and now you balance = " + balance);
        }else{
            double lackOfMoney = amount - balance;
            String message = "You tried to withdraw " + amount +
                    " $ from ypu balance, but you balance = " + balance +
                    ", please add more cash = " + lackOfMoney;
            throw new NoMoneyException(message);
        }
    }
}
