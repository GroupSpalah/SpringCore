package org.example.homeworks.anton.hw_09_04;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Program implements Calculateble {
    @Override
    public void calculate() {
        System.out.println("From 8 to 16");
    }
}
