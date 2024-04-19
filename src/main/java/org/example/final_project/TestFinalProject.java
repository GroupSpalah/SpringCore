package org.example.final_project;

import org.example.final_project.service.CarServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestFinalProject {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigAppProject.class);

        CarServiceImpl service = context.getBean(CarServiceImpl.class);

        service.save();

    }
}
