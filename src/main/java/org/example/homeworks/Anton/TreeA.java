package org.example.homeworks.Anton;

import lombok.AllArgsConstructor;
import lombok.AccessLevel;

import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class TreeA {
    int age;
    double height;

    public  void show(){
        System.out.println("Done: " + age + "  " + height);
    }

}
