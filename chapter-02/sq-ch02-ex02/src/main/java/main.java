import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        String s = context.getBean(String.class);
        System.out.println(s);
        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
