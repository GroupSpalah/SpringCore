package org.example.via_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestViaXmlAutowiring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAutowire.xml");

        ReaderService service = context.getBean(ReaderService.class);

        service.getReader().print();
    }
}
