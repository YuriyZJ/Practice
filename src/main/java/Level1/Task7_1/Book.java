package Level1.Task7_1;

import java.util.Objects;

public class Book {
    private final int ISBN;
    private String title;
    private String author;
    private BookStatus status;

    public Book(int ISBN, String title, String author, BookStatus status) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public void changeStatus() {
        this.status = (this.status == BookStatus.FREE) ? BookStatus.BOOKING : BookStatus.FREE;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ISBN == book.ISBN && Objects.equals(title, book.title) && Objects.equals(author, book.author) && status == book.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title, author, status);
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status=" + status +
                '}';
    }
}
