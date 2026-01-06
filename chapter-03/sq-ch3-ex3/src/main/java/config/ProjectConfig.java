package config;

import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    Person person(Parrot parrot) {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot());
        return person;
    }
}
