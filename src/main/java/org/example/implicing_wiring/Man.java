package org.example.implicing_wiring;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
public class Man {

//    @Autowired
    Phone phone;

    /*public Man(Phone phone) {
        this.phone = phone;
    }*/

    @Autowired
    @Qualifier(value = "viber")
    Callable callable;

  /*  public Man(@Qualifier(value = "viber") Callable callable) {
        this.callable = callable;
    }*/
}
