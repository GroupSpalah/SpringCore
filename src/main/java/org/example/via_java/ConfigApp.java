package org.example.via_java;


import org.example.via_java.with_interface.Actionable;
import org.example.via_java.with_interface.Bird;
import org.example.via_java.with_interface.Fly;
import org.example.via_java.with_interface.Run;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigApp {

    /*@Bean
    public Student student(Group group) {
        return new Student(group);
    }*/
    @Bean
    public Student student() {
        return new Student(group());
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Group group() {
        return new Group("IT");
    }

    @Bean
    @Primary
    public Actionable fly() {
        return new Fly();
    }

    @Bean
    public Actionable run() {
        return new Run();
    }

    /*@Bean
    public Bird bird(@Qualifier("run") Actionable actionable) {
        return new Bird(actionable);
    }*/

    @Bean
    public Bird bird(Actionable actionable) {
        return new Bird(actionable);
    }
}
