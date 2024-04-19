package org.example.homeworks.mihail.hw_09_04.use_interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Base1 {
    @Autowired
    @Qualifier(value = "geometry1")
    Action action;

    public void calculatorPlusMinus() {
        System.out.println("+");
        System.out.println("-");
    }

}
