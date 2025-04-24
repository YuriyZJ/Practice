package Level2.Chapter5.Task3;

public class User {
    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        } else {
            this.age = age;
        }
    }
}
