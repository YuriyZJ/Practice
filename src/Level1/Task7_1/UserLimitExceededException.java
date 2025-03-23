package Level1.Task7_1;

public class UserLimitExceededException extends RuntimeException {
    public UserLimitExceededException(String message) {
        super(message);
    }
}
