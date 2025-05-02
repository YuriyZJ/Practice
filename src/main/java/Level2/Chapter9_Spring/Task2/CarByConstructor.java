package Level2.Chapter9_Spring.Task2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarByConstructor {
    private Engine engine;

    @Autowired
    public void CarByConstructor(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        System.out.println("CarByConstructor driving + " + engine.sound());
    }

    @PostConstruct
    public void init(){
        System.out.println("CarByConstructor init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("CarByConstructor destroy");
    }
}
