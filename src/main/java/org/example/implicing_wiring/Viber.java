package org.example.implicing_wiring;

import org.springframework.stereotype.Component;

@Component
public class Viber implements Callable {
    @Override
    public void call() {
        System.out.println("Call by viber");
    }
}
