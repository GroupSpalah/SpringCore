package org.example.homeworks.mihail.hw_02_04;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@NoArgsConstructor
public class Math {
    Geometry geometry;

    public void translationFunction() {
        System.out.println("8 -> 16");

    }
}
