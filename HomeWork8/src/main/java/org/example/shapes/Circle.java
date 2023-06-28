package org.example.shapes;

public class Circle extends Shape {
    private static final String name = "Circle";

    public String getName() {
        return name;
    }

    @Override
    public void printName() {
        System.out.println("Shape name is " + name);
    }
}
