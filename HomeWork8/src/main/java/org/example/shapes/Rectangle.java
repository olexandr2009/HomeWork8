package org.example.shapes;

public class Rectangle extends Shape {
    private static final String name = "Rectangle";

    public String getName() {
        return name;
    }
    @Override
    public void printName() {
        System.out.println("Shape name is " + name);
    }
}
