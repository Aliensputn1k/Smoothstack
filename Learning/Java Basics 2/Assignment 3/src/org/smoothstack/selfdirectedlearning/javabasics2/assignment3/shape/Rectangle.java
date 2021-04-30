package org.smoothstack.selfdirectedlearning.javabasics2.assignment3.shape;

public class Rectangle implements Shape {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double calculateArea() {
        return (this.width * this.length);
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
