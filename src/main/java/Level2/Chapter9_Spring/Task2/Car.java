package Level2.Chapter9_Spring.Task2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    // создание зависимости через конструктор
    @Autowired
    public Car(Engine engine){
        this.engine = engine;
    }

    // создание зависимости через set
    @Autowired
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    // создание зависимости через поле
    @Autowired
    private Engine engine2;

    @PostConstruct
    public void init(){
        System.out.println("initializing");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroying");
    }

    public void drive(){
        System.out.println(engine.sound());
    }

    @Component
    @Scope("singleton")
    public static class EngineSingleton{}

    @Component
    @Scope("prototype")
    public static class EnginePrototype{}
}
