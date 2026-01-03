import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());
    }
}
