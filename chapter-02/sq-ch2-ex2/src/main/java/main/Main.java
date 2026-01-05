package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());
        String s = context.getBean(String.class);
        System.out.println(s);
        Integer ten = context.getBean(Integer.class);
        System.out.println(ten);
    }
}
