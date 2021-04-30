package org.smoothstack.selfdirectedlearning.javabasics2.assignment3.shape;

public class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return (((double) this.base * this.height) / 2);
    }

    public void display() {
        for (int i  = 0; i < this.height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
