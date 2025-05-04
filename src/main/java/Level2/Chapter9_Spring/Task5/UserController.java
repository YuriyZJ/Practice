package Level2.Chapter9_Spring.Task5;

import Level2.Chapter8_Tests.Task2_1.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id){
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        repo.save(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@RequestBody User user, @PathVariable long id){
        user.setId(id);
        repo.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id){
        repo.deleteById(id);
    }
}
