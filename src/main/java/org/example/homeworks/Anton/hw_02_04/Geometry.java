package org.example.homeworks.Anton.hw_02_04;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Geometry {

    public void sinCosMethod(){
        System.out.println("Sin");
        System.out.println("Cos");
    }
}
