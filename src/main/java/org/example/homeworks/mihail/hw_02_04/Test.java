package org.example.homeworks.mihail.hw_02_04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.M.xml");
        Programmer programmer = context.getBean(Programmer.class);
        Geometry geometry = context.getBean(Geometry.class);
        Math math = context.getBean(Math.class);

        programmer.functionAbs();
        programmer.functionSqr();
        geometry.functionSin();
        geometry.functionCos();
        math.translationFunction();

        Base base = context.getBean(Base.class);
        base.calculatorPlusMinus();
    }


}
