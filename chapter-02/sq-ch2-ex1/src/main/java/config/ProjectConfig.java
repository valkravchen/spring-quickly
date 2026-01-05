package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }
}
