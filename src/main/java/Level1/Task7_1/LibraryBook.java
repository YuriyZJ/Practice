package Level1.Task7_1;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LibraryBook {
    private int startISBN = 10000;
    private int startID = 500;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private List<Book> booksToCatalog = new ArrayList<>();
    private List<User> registeredUsers = new ArrayList<>();

    public int addBook(Book book) {
        booksToCatalog.add(book);
        int ISBN = startISBN++;
        return ISBN;
    }

    public int registerUser(User user) {
        registeredUsers.add(user);
        int ID = startID++;
        return ID;
    }

    //private void logOperation();

    public void borrowBook(User user, Book book) throws BookNotAvailableException, EntityNotFoundException, UserLimitExceededException {
        for (Book bookToBorrow : booksToCatalog) {
            if (bookToBorrow.equals(book)) {}
        }
        if (registeredUsers.contains(user.getID())) {
            user.addBook(book);
        } else {
            throw new EntityNotFoundException("User with ID " + user.getID() + " not found");
        }
        if (booksToCatalog.contains(book)) {
            book.changeStatus();
        } else{
            throw new BookNotAvailableException("Book is not available");
        }
    }

    public void returnBook(User user, Book book) throws BookNotAvailableException, UserLimitExceededException {

    }

    public void foundBook (String author){
        for (Book book : booksToCatalog) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.toString());
            }
        }
    }

    public void foundUserLimitExceeded() {
        for (User user : registeredUsers) {
            if (user.limitBook()){
                System.out.println(user.toString());
            }
        }
    }
}
