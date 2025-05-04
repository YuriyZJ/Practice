package Level2.Chapter9_Spring.Task4;

import Level2.Chapter8_Tests.Task2_1.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController // (класс, который отвечает на запросы) класс — REST-контроллер, который обрабатывает HTTP-запросы и возвращает JSON или текст. Это как @Controller, но без шаблонов (HTML).
@RequestMapping("/users") // (Обрабатывает HTTP-запрос по URL и методу) Базовый путь — все методы в этом контроллере будут начинаться с /users (например, /users/1, /users).
public class UserController {

    private final Map<Integer, String> users = new HashMap<>(); //* временная “база данных” в виде Java-карты Map, где id — это ключ (целое число), а значение — имя пользователя (строка). Мы используем HashMap просто для упрощения — в реальном проекте это была бы база данных.

    // GET — получить всех пользователей
    @GetMapping // Этот метод обрабатывает HTTP-запрос типа GET по адресу /users.
    public Collection<String> getAllUsers(){
        return users.values(); // Возвращает список всех имён (значения из Map).
    }

    // GET — получить пользователя по ID
    @GetMapping("/{id}") // Путь с переменной — например, /users/2
    public String getUserById(@PathVariable int id){ // @PathVariable int id - Подставляет id из URL в аргумент метода
        return users.getOrDefault(id, "User not found");
    }
    // POST — добавить пользователя
    @PostMapping // Метод вызывается при POST-запросе на /users
    @ResponseStatus // Можно указать статус ответа (например, 201 Created) — пока не указан, по умолчанию 200 OK.
    public void addUser(@RequestBody User user){ // @RequestBody - Говорит Spring’у: “Возьми тело запроса (JSON) и преобразуй его в объект User”
        users.put(user.getId(), user.getName()); // Добавляем нового пользователя в Map.
    }

    // PUT — обновить пользователя
    @PutMapping("/{id}") // Обработка PUT-запроса для обновления данных пользователя
    public void updateUser(@PathVariable int id, @RequestBody User user){ // Берём ID из URL и новые данные из JSON
        users.put(id, user.getName());
    }

    // DELETE — удалить пользователя
    @DeleteMapping("/{id}") // Обработка DELETE-запроса, удаление по ID
    public void deleteUser(@PathVariable int id){ // Берём ID из URL
        users.remove(id);
    }
}
