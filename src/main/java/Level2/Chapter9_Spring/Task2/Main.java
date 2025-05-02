package Level2.Chapter9_Spring.Task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Level2.Chapter9_Spring.Task2")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Car car = context.getBean(Car.class);
        car.drive();
    }
}
