package Level2.Chapter9_Spring.Task1;

import org.springframework.stereotype.Component;

@Component // говорит Spring: “Создай бин этого класса и управляй им”.
public class HelloService {
    public String sayHello(){
        return "Hello from HelloService!";
    }
}
