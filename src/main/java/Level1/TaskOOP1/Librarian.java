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
        Book book = library.getBook(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(user.getName() + " borrowed the book: " + title);
        } else {
            throw new BookNotAvailableException("Book '" + title + "' is not available.");
        }
    }

    @Override
    public void returnBook(String title, User user) {
        Library library = Library.getInstance();
        Book book = library.getBook(title);
        if (book != null) {
            book.setAvailable(true);
            System.out.println(user.getName() + " returned the book: " + title);
        }
    }
}

