package Level1.TaskOOP1;

public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // Добавляем книги
        library.addBook(new Book("1984", "George Orwell", 12345));
        library.addBook(new Book("Brave New World", "Aldous Huxley", 67890));

        // Создаем пользователей
        User alice = new User(1, "Alice");
        Librarian bob = new Librarian(2, "Bob");

        try {
            // Боб выдает книгу Алисе
            bob.borrowBook("1984", alice);

            // Попытка взять ту же книгу снова
            bob.borrowBook("1984", alice); // Должно выбросить исключение

        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Алиса возвращает книгу
        bob.returnBook("1984", alice);
    }
}
