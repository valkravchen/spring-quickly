package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private final Person person;

    @Autowired
    public Parrot(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
