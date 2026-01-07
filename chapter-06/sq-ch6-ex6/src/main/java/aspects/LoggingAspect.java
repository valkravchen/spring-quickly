package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Аспект логирования: вызов перехваченного метода");
        Object returnedValue = joinPoint.proceed();
        logger.info("Аспект логирования: метод выполнен и вернул " + returnedValue);
        return returnedValue;
    }
}

