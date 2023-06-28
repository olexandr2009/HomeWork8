package org.example.shapes;

public class Triangle extends Shape{
    private static final String name = "Triangle";


    public String getName() {
        return name;
    }
    @Override
    public void printName() {
        System.out.println("Shape name is " + name);
    }
}
