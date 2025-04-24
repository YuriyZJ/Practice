package Level1.Task7_1;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final int ID;
    private String name;
    static List<Book> books = new ArrayList<>(5);

    public User(int ID, String name, List<Book> books) {
        this.ID = ID;
        this.name = name;
        this.books = books;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    private void borrowBook(Book book) throws UserLimitExceededException{
        if (books.size() <= 5) {
            books.add(book);
        } else {
            throw new UserLimitExceededException("Limit is exceeded");
        }
    }

    public boolean limitBook(){
        return (books.size() <= 5) ? true : false;
    }

}
