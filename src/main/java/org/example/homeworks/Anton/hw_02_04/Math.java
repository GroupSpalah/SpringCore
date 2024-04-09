package org.example.homeworks.Anton.hw_02_04;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Math {
    Geometry geometry;

    public void sqrtAbsMethod(){
        System.out.println("sqrt");
        System.out.println("abs");
    }
}
