package org.example.homeworks.mihail;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.M.xml");

        Three three = context.getBean(Three.class);

        three.print();
    }
}
