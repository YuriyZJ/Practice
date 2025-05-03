package Level2.Chapter9_Spring.Task2_1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singletonEngine") // Регистрирует этот бин в Spring под именем "singletonEngine". Это имя можно использовать для внедрения через @Qualifier("singletonEngine").
@Scope("singleton") // Указывает, что Spring должен создать один объект этого класса на всё приложение. При каждом getBean(...) возвращается один и тот же экземпляр. Это поведение по умолчанию, но ты явно его указал — хорошо для наглядности.
public class SingletonBean extends Engine{
    public SingletonBean(){ // Конструктор. В нём логируется создание объекта. Полезно, чтобы увидеть в консоли, когда именно создаётся бин.
        System.out.println("SingletonBean created " + this);
    }
}
