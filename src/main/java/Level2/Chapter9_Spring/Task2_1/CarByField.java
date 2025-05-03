package Level2.Chapter9_Spring.Task2_1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarByField {

    @Autowired
    private Engine engine;

    public void drive() {
        System.out.println("CarByField driving + " + engine.sound());
    }

    @PostConstruct
    public void init() {
        System.out.println("CarByField init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("CarByField destroy");
    }
}
