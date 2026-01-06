package proxies;

import model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Отправка уведомления для получения комментариев: " + comment.getText());
    }
}
