package Level2.Chapter9_Spring.Task4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Это значит: “Я — главный класс приложения, запусти всё автоматически”. Главная аннотация, которая включает сразу 3 другие: @Configuration, @EnableAutoConfiguration, @ComponentScan.
public class DemoApplication { // как главный класс main
    public static void main(String[] args) { // точка входа
        SpringApplication.run(DemoApplication.class, args); // Запускает Spring Boot, поднимает встроенный веб-сервер (обычно Tomcat), сканирует классы и инициализирует приложение.
    }
}