package org.example.homeworks.mihail.hw_09_04.use_interface;

import org.springframework.stereotype.Component;

@Component
public class Geometry1 implements Actionable {

    @Override
    public void action() {
        System.out.println("cos");
    }
}
