package org.example.homeworks.mihail.hw_09_04.implicing_wiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Base {
    @Autowired
    Programmer programmer;

    @Autowired
    Math math;

    public void calculatorPlusMinus() {
        System.out.println("+");
        System.out.println("-");
    }

}
