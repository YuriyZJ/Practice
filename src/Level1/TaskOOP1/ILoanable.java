package Level1.TaskOOP1;

//интерфейс определяет контракт для объектов, которые можно выдавать пользователям.

public interface ILoanable {
    void borrowBook(String title, User user) throws BookNotAvailableException;
    void returnBook(String title, User user);
}
