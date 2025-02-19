package Level1.Task7___;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<BankAccount> bankAccounts = new ArrayList<>();
    private int nextAccountId = 1000;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    // Создание счета
    public int createAccount(double balance) throws NegativeAmountException {
        if (balance < 0){
            throw new NegativeAmountException("The initial balance cannot be negative");
        }
        int accountId = nextAccountId++;
        bankAccounts.add(new BankAccount(accountId, balance));
        return accountId;
    }

    // Для поиска счета, что бы не дублировать в др методах
    private BankAccount findAccount(int accountId) throws AccountNotFoundException {
        for (BankAccount account : bankAccounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        throw new AccountNotFoundException(accountId);
    }

    private void logOperation(String operationType, int accountId, double amount, boolean success) {
        String timestamp = LocalDateTime.now().format(formatter);
        String status = success ? "Success" : "Error";
        System.out.printf("[%s] %-8s | Счет: %d | Сумма: %8.2f | Статус: %s%n",
                timestamp, operationType, accountId, amount, status);
    }

    public void deposit (int accountId, double amount) throws AccountNotFoundException, NegativeAmountException {
        BankAccount account = findAccount(accountId);
        try {
            account.deposit(amount);
            logOperation("DEPOSIT", accountId, amount, true);
        } catch (NegativeAmountException e) {
            logOperation("DEPOSIT", accountId, amount, false);
            throw e;
        }
    }

    public void withdraw (int accountId, double amount) throws AccountNotFoundException, NegativeAmountException {
        BankAccount account = findAccount(accountId);
        try {
            account.deposit(amount);
            logOperation("WITHDRAW", accountId, amount, true);
        } catch (NegativeAmountException e) {
            logOperation("WITHDRAW", accountId, amount, false);
            throw e;
        }
    }

    public void transfer (int fromAccountId, int toAccountId, double amount) throws InsufficientFundsException, AccountNotFoundException, NegativeAmountException {
        BankAccount fromAccount = findAccount(fromAccountId);
        BankAccount toAccount = findAccount(toAccountId);
        try{
            fromAccount.withdraw(amount);
            toAccount.withdraw(amount);
            logOperation("TRANSFER", fromAccountId, amount, true);
        } catch (NegativeAmountException e) {
            logOperation("TRANSFER", fromAccountId, amount, false);
            throw e;
        }
    }

    public void printBankAccounts() {
        for (BankAccount bankAccount : bankAccounts) {
            System.out.println(bankAccount.toString());
        }
    }

    public void printFoundBankAccountsMoreThen(double balanceMore){
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getBalance() > balanceMore){
                System.out.println(bankAccount.toString());
            }
        }
    }
}
