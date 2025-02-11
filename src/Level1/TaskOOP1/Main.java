package Level1.TaskOOP1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell", 12345));

        User user = new User(1, "Alice");
        Librarian librarian = new Librarian(2, "Bob");

        librarian.borrowBook(library, "1984", user);
    }
}
