package org.example.homeworks.mihail.hw_09_04.use_interface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.M.xml");

        Base1 base = context.getBean(Base1.class);
        base.action.action();
    }


}
