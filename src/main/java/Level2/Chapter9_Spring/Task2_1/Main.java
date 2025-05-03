package Level2.Chapter9_Spring.Task2_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Level2.Chapter9_Spring.Task2_1")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        // проверка внедрения зависимостей
        context.getBean(CarByConstructor.class).drive();
        context.getBean(CarBySetter.class).drive();
        context.getBean(CarByField.class).drive();

        // Проверка прототипов
        Engine singleton1 = context.getBean("singletonEngine", Engine.class);
        Engine singleton2 = context.getBean("singletonEngine", Engine.class);
        System.out.println("SingletonEngine " + (singleton1 == singleton2));

        Engine prototype1 = context.getBean("prototypeEngine", Engine.class);
        Engine prototype2 = context.getBean("prototypeEngine", Engine.class);
        System.out.println("PrototypeEngine " + (prototype1 == prototype2));

        // завершение контекста (вызов PreDestroy)
        context.close();
    }
}
