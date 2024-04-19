package org.example.homeworks.anton.hw_09_04;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestImplicing {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppContext.xml");

       Program program = context.getBean(Program.class);
       Math math = context.getBean(Math.class);
       Base base = context.getBean(Base.class);

        Calculator calculator = context.getBean(Calculator.class);
        calculator.calculateble.calculate();
    }
}
