package org.example.shapes;

public class Hexagon extends Shape {
    private static final String name = "Hexagon";

    public String getName() {
        return name;
    }
    @Override
    public void printName() {
        System.out.println("Shape name is " + name);
    }
}
