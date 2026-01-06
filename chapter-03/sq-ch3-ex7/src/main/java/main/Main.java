package main;

import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("beans.Person's name: " + person.getName());
        System.out.println("beans.Person's parrot: " + person.getParrot());
    }
}
