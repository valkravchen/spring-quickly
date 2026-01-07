package aspects;

import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        logger.info("Метод " + methodName +
                " с параметрами " + Arrays.asList(arguments) +
                " будет выполнен");
        Comment comment = new Comment();
        comment.setText("Другой текст!");
        Object[] newArguments = {comment};
        Object returnedByMethod = joinPoint.proceed(newArguments);
        logger.info("Метод выполнен и вернул " + returnedByMethod);
        return "FAILED";
    }
}

