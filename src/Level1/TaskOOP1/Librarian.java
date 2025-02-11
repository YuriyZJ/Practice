package Level1.TaskOOP1;

import java.util.Objects;

//Librarian – фасад для работы с Library

public class Librarian extends User implements ILoanable {

    public Librarian(int ID, String name) {
        super(ID, name);
    }

    @Override
    public void borrowBook(String title, User user) throws BookNotAvailableException {
        Library library = Library.getInstance();
        Book book = library.borrowBook(title);
        if (book != null) {
            System.out.println("Выдана книга: " + book.getTitle());
        } else {
            throw new BookNotAvailableException("Book '" + title + "' is not available.");
        }
    }

    @Override
    public void returnBook(String title, User user) {

    }
}
/*
    @Override
    public void returnBook(String title, User user) {
        Library library = Library.getInstance();
        Book book = library.getBook(title);
        if (book != null) {
            book.setAvailable(true);
            System.out.println(user.getName() + " returned the book: " + title);
        }








    // Метод для добавления книги
    public void addBook(Book book) {
        library.addBook(book);
        System.out.println("Библиотекарь добавил книгу: " + book.getTitle());
    }

    // Метод для выдачи книги
    public void borrowBook(String title) {
        Book book = library.borrowBook(title);
        if (book != null) {
            System.out.println("Выдана книга: " + book.getTitle());
        } else {
            System.out.println("Книга с названием '" + title + "' не найдена в библиотеке.");
        }
    }

    // Метод для возврата книги
    public void returnBook(Book book) {
        library.returnBook(book);
        System.out.println("Книга '" + book.getTitle() + "' возвращена в библиотеку.");
    }*/

