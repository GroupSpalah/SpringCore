package org.example.homeworks.mihail.hw_09_04.use_interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Math1 {
    @Autowired
    Geometry1 geometry;

    public void translationFunction() {
        System.out.println("8 -> 16");

    }
}
