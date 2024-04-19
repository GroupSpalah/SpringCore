package org.example.homeworks.anton.hw_09_04;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*@Scope("prototype")*/
public class Base implements Calculateble {
    Program program;
    Math math;
    @Override
    public void calculate() {
        System.out.println("Plus");
        System.out.println("Minus");
    }
}


