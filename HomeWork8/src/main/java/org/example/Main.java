package org.example;

import org.example.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Quad(),
                new Rectangle(),
                new Hexagon(),
                new Triangle()
        };

        Human human = new Human();
        printShapeArr(shapes,human);
    }
    public static void printShapeArr(Shape[] shapes,Human human){

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(i);
            human.printShapeName(shapes[i]);
        }
    }
}