package org.example.homeworks.anton.hw_09_04;


import org.springframework.stereotype.Component;

@Component

public class Geometry implements Calculateble {
    @Override
    public void calculate() {
        System.out.println("Sin");
        System.out.println("Cos");
    }
}
