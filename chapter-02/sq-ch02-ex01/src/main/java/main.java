import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    static void main() {
        var context = new AnnotationConfigApplicationContext();
        Parrot parrot = new Parrot();
    }
}
