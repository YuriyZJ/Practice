package Level1.Task4;

import java.lang.IllegalArgumentException;

public class BankAccount {
    private int accountNumber;
    private int balance;

    public BankAccount(){}

    public BankAccount(int accountNumber, int balance){
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        if (amount < 0) {
            throw new IllegalArgumentException("Summa deposit can't to be negative: " + amount);
        }
        this.balance += amount;
    }

    public void withdraw(int amount){
        if (amount < 0) {
            throw new IllegalArgumentException("Summa withdraw can't to be negative: " + amount);
        }
        if (amount > this.balance){
            throw new IllegalArgumentException("Don't have enough money");
        } else {
            this.balance -= amount;
        }
    }
}
