package org.example.homeworks.anton.hw_09_04;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestImplicing {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppContext.xml");

        Calculator calculator = context.getBean(Calculator.class);
        calculator.calculateble.calculate();

    }
}
