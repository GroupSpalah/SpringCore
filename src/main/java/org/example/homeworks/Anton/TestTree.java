package org.example.homeworks.Anton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTree {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("treeAcontext.xml");
TreeA treeA = context.getBean(TreeA.class);
treeA.show();
    }
}