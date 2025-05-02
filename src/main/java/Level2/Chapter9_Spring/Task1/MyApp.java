package Level2.Chapter9_Spring.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
    private HelloService helloService;

    @Autowired // говорит Spring: “вставь сюда бин HelloService”.
    public MyApp(HelloService helloService) { //добавили зависимость
        this.helloService = helloService;
    }

    public void run() {
        System.out.println(helloService.sayHello());
    }
}
