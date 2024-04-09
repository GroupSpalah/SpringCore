package org.example.homeworks.Anton.hw_02_04;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Program {
    public void bitMethod(){
        System.out.println("8 -> 16");
    }
}
