package org.example.homeworks.mihail.hw_09_04.use_interface;

import org.springframework.stereotype.Component;

@Component
public class Programmer1 implements Action{

    public void functionAbs() {
        System.out.println("abs");
    }

    @Override
    public void action() {
        System.out.println("abs");

    }
}
