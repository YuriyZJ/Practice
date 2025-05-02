package Level2.Chapter9_Spring.Task2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarBySetter {
    private Engine engine;

    @Autowired
    public CarBySetter(Engine engine){
        this.engine = engine;
    }

    public void drive(){
        System.out.println("CarBySetter drive " + engine.sound());
    }

    @PostConstruct
    public void init(){
        System.out.println("CarBySetter init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("CarBySetter destroy");
    }
}
