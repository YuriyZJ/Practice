package Level2.Chapter9_Spring.Task2_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // работает через AppConfig
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // работает через XML
        // или можно так ApplicationContext context = new ClassPathXmlApplicationContext("Level2/Chapter9_Spring/Task2_2/applicationContext.xml"); // но по стандарту ложат в корень в папку resources

        Car car = context.getBean(Car.class);
        car.drive();
    }
}
