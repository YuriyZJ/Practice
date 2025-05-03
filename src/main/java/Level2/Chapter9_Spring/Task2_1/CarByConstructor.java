package Level2.Chapter9_Spring.Task2_1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarByConstructor { //Говорит Spring: «Это бин, зарегистрируй его в контексте». Spring сам создаст объект CarByConstructor.
    private Engine engine; // Поле зависимости — сюда можно внедрить бин Engine (например, через конструктор, сеттер или поле). Сейчас оно не внедрено, поэтому поле останется null, если ты не добавишь конструктор или @Autowired.

    @Autowired
    public void CarByConstructor(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        System.out.println("CarByConstructor driving + " + engine.sound());
    }

    @PostConstruct // Метод init() будет вызван после создания бина, но до того как он будет отдан клиенту. Обычно здесь инициализируют ресурсы, логируют и т.п.
    public void init(){
        System.out.println("CarByConstructor init");
    }

    @PreDestroy // Метод destroy() будет вызван перед уничтожением бина (например, при закрытии ApplicationContext). Здесь освобождают ресурсы, закрывают соединения и т.п.
    public void destroy(){
        System.out.println("CarByConstructor destroy");
    }
}
