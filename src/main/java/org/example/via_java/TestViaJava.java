package org.example.via_java;

import org.example.via_java.with_interface.Bird;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestViaJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigApp.class);

      /*  Student student = context.getBean(Student.class);

        String number = student.getGroup().getNumber();

        System.out.println(number);*/

        Bird bird = context.getBean(Bird.class);

        bird.getActionable().action();

    }
}
