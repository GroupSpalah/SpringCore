package org.example.homeworks.mihail.hw_09_04.implicing_wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.M.xml");

        Base base = context.getBean(Base.class);
        base.math.translationFunction();
    }


}
