package Level1.Task7_1;

public class BookNotAvailableException extends RuntimeException {
    public BookNotAvailableException(String name) {
        super("Book" + name + " is not available");
    }
}
