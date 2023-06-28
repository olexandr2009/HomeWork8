package org.example.shapes;

public class Quad extends Shape {

    private static final String name = "Quad";

    public String getName() {
        return name;
    }
    @Override
    public void printName() {
        System.out.println("Shape name is " + name);
    }
}
