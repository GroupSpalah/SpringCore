package org.example.homeworks.anton.hw_09_04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    Base base;
    Math math;

    @Autowired
@Qualifier(value = "base")
    Calculateble calculateble;

  /*  @Autowired
   @Qualifier(value = "math")
        Calculateble calculateble;*/

  /*  @Autowired
    @Qualifier(value = "program")
    Calculateble calculateble;*/
}
