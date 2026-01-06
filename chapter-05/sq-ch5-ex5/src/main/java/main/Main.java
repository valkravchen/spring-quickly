package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    static void main() {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Перед получением доступа к CommentService");
        var service = c.getBean(CommentService.class);
        System.out.println("После получения CommentService");
    }
}
