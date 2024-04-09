package org.example.homeworks.anton.hw_02_04;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Base {
    Program program;
    Math math;

    public  void plusMinusMethod(){
        System.out.println("Plus");
        System.out.println("Minus");
    }
}
