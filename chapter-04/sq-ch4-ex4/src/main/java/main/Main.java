package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService service = context.getBean(CommentService.class);
        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");
        service.publishComment(comment);
    }
}
