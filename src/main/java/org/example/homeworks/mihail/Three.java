package org.example.homeworks.mihail;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Three {
    int age;
    double height;

    public void print() {
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}
