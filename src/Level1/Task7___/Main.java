package Level1.Task7___;

import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws NegativeAmountException, AccountNotFoundException, InsufficientFundsException {
        Bank bank = new Bank();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            // Создание счетов
            int acc1 = bank.createAccount(1500);
            int acc2 = bank.createAccount(500);
            int acc3 = bank.createAccount(0);

            // Операции
            bank.deposit(acc1, 1500);
            bank.withdraw(acc1, 500);
            bank.transfer(acc1, acc2, 1000);

            // Попытка ошибочной операции
            bank.transfer(acc3, acc1, 2000);

        } catch (AccountNotFoundException | NegativeAmountException | InsufficientFundsException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // Вывод результатов
        System.out.println("\nВсе счета:");
        bank.printBankAccounts();

        System.out.println("\nСчета с балансом > 1000:");
        bank.printFoundBankAccountsMoreThen(1000);
    }
}
