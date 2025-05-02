package Level2.Chapter9_Spring.Task2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypeEngine") //указываем @Component("имяБина"), чтобы потом различать их при внедрении через @Qualifier.
@Scope("prototype")
public class PrototypeBean extends Engine {
    public PrototypeBean() {
        System.out.println("PrototypeBean created " + this);
    }
}
