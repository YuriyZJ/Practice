package Level2.Chapter9_Spring.Task4;

import Level2.Chapter8_Tests.Task2_1.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Map<Integer, String> users = new HashMap<>();

    // GET — получить всех пользователей
    @GetMapping
    public Collection<String> getAllUsers(){
        return users.values();
    }

    // GET — получить пользователя по ID
    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id){
        return users.getOrDefault(id, "User not found");
    }
    // POST — добавить пользователя
    @PostMapping
    @ResponseStatus
    public void addUser(@RequestBody User user){
        users.put(user.getId(), user.getName());
    }

    // PUT — обновить пользователя
    @PutMapping("/{id}")
    public void updateUser(@PathVariable int id, @RequestBody User user){
        users.put(id, user.getName());
    }

    // DELETE — удалить пользователя
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        users.remove(id);
    }
}
