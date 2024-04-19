package org.example.via_java.with_interface;

public class Fly implements Actionable {
    @Override
    public void action() {
        System.out.println("Fly");
    }
}
