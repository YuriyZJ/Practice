package Level1.TaskOOP1;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private static Library instance; //Все части программы работают с одним и тем же объектом библиотеки, а не создают копии.
    private Map<String, Book> books = new HashMap<>();

    // Приватный конструктор запрещает создание объектов извне
    private Library() {
    }

    //паттерн Singleton (Одиночка) - Этот метод гарантирует, что в программе будет существовать только один объект библиотеки (экземпляр).
    public static Library getInstance() {
        if (instance == null) { //Проверяем, существует ли уже объект Library.
            instance = new Library(); // Если instance == null, создаем новый объект Library.
        }
        return instance;
    }
    //Все последующие вызовы getInstance() метод не создаёт новый объект, а возвращает уже существующий.

    //методы по управлению книгами принадлежат библиотеке.

    //Метод принимает объект Book
    public void addBook(Book book) {
        books.put(book.getTitle(), book); // на HashMap вызывается метод put, который ложит новый объект в коллекцию (Ключ → метод book.getTitle() для получения названия книги и объект Book)
    }

    public Book getBook(String title) {
        return books.get(title);
    }
}
