package org.example.via_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestViaXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        FileReader reader = context.getBean(FileReader.class);

        reader.print();
    }
}
