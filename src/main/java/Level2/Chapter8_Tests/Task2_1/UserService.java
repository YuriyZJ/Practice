package Level2.Chapter8_Tests.Task2_1;

public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String getUserEmail(Long id) {
        User user = repository.findById(id);
        return user != null ? user.getEmail() : null;
    }
}
