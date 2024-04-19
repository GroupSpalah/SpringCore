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
public class Base {
    Programmer programmer;
    Math math;
    public void calculatorPlusMinus() {
        System.out.println("+");
        System.out.println("-");
    }

}
