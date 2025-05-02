package Level2.Chapter9_Spring.Task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Это аннотация, говорящая Spring, что класс Main — это конфигурационный класс (на его основе собирается контейнер). То есть он заменяет XML-файл конфигурации (applicationContext.xml).
@ComponentScan(basePackages = "Level2.Chapter9_Spring.Task1") //Spring просканирует указанный пакет и найдёт твои классы с @Component, @Service, @Repository, @Controller.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class); //Создаём Spring-контейнер, передавая ему конфигурационный класс Main. AnnotationConfigApplicationContext — это реализация ApplicationContext, которая работает с Java-аннотациями, а не с XML
        MyApp app = context.getBean(MyApp.class); //Получаем бин MyApp из контейнера. Spring уже сам создал объект MyApp, внедрил в него зависимости (если они есть), и теперь ты просто берёшь его из контейнера как готовый объект.
        app.run(); //вызываем метод run() у бина MyApp.
    }
}


