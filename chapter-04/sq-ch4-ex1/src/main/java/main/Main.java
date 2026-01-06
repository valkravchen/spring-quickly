package main;

import model.Comment;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    static void main() {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
        Comment comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");
        commentService.publishComment(comment);
    }
}
