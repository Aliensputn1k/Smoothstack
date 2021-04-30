package org.smoothstack.selfdirectedlearning.javabasics2.assignment3;

import org.smoothstack.selfdirectedlearning.javabasics2.assignment3.shape.Rectangle;
import org.smoothstack.selfdirectedlearning.javabasics2.assignment3.shape.Circle;
import org.smoothstack.selfdirectedlearning.javabasics2.assignment3.shape.Triangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 4);
        System.out.println("Area: " + rectangle.calculateArea());
        rectangle.display();
        System.out.println();

        Circle circle = new Circle(2);
        System.out.println("Area: " + circle.calculateArea());
        circle.display();
        System.out.println();

        Triangle triangle = new Triangle(3, 9);
        System.out.println("Area: " + triangle.calculateArea());
        triangle.display();
        System.out.println();
    }
}
