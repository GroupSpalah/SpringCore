package org.example.homeworks.anton.hw_26_03;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TreeA {
    int age;
    double height;

    public  void show(){
        System.out.println("Age:" + age + "\t" + "Height:" + height );
    }
}
