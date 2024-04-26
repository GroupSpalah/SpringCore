package org.example.homeworks.anton.hw_09_04;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Math implements Calculateble {

    @Override
    public void calculate() {
        System.out.println("sqrt");
        System.out.println("abs");
    }
}
