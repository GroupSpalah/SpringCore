package org.example.implicing_wiring;

import org.example.via_xml.FileReader;
import org.example.via_xml.ReaderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestViaImplicingWiring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Man man = context.getBean(Man.class);

//        System.out.println(man.phone.number);

        man.callable.call();
    }
}
