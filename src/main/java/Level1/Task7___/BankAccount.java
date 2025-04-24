package Level1.Task7___;

public class BankAccount {
    private int accountId;
    private double balance;

    public BankAccount(){}

    public BankAccount(int accountId, double balance){
        this.accountId = accountId;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void deposit(double amount) throws NegativeAmountException{
        if (amount < 0){
            throw new NegativeAmountException("Can't to be negative amount");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
        if (amount < 0){
            throw new NegativeAmountException("Can't to be negative amount");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Don't have enough money to withdraw");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                '}';
    }
}
