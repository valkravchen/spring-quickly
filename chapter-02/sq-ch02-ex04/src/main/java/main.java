import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());
    }
}
