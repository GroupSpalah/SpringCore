package org.example.via_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestViaXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        /*FileReader reader1 = context.getBean("fileReader", FileReader.class);

        reader1.setFileName("Poem.txt");

        reader1.print();*/

       /* FileReader reader2 = context.getBean("fileReaderNew", FileReader.class);

        reader2.print();*/

        ReaderService service = context.getBean(ReaderService.class);

        service.getReader().print();

        FileReader fileReader = new FileReader();

    }
}
