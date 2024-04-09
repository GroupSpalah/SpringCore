package org.example.homeworks.Anton.hw_02_04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppContext.xml");
        Program program = context.getBean(Program.class);

        Math math = context.getBean(Math.class);
        program.bitMethod();
      
        math.sqrtAbsMethod();

        Base base = context.getBean(Base.class);
        base.plusMinusMethod();
    }
}
