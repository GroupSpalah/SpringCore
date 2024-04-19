package org.example.homeworks.mihail.hw_09_04.implicing_wiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Math{
    @Autowired
    Geometry geometry;

    public void translationFunction() {
        System.out.println("8 -> 16");

    }
}
