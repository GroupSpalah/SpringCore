package org.example.homeworks.anton.hw_09_04;


import org.springframework.stereotype.Component;

@Component

public class Base implements Calculateble {

    @Override
    public void calculate() {
        System.out.println("Plus");
        System.out.println("Minus");
    }
}


