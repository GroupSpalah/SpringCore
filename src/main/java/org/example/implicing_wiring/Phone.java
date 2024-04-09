package org.example.implicing_wiring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Phone implements Callable {
    public String number = "067";

    @Override
    public void call() {
        System.out.println("Call by phone");
    }
}
