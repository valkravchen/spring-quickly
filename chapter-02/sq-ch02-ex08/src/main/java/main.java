import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot x = new Parrot();
        x.setName("Kiki");
        Supplier<Parrot> parrotSupplier = () -> x;
        context.registerBean("parrot1", Parrot.class, parrotSupplier);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());
    }
}
