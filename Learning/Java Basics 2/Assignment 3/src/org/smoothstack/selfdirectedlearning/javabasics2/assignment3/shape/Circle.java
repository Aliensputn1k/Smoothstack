package org.smoothstack.selfdirectedlearning.javabasics2.assignment3.shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (Math.PI * (Math.pow(this.radius, 2)));
    }

    public void display() {
        int radiusCast = (int) this.radius;
        double diameter = (2 * radiusCast);
        double distance;

        // Took me far too long to think about.
        // Solution can be found at <https://www.geeksforgeeks.org/program-print-circle-pattern/>
        // ... has been slightly altered to suit my project's variables.
        for (int i = 0; i <= diameter; i++) {
            for (int j = 0; j <= diameter; j++) {
                distance = Math.sqrt(Math.pow((i - radiusCast), 2) + (Math.pow((j - radiusCast), 2)));
                if (distance > (radiusCast - 0.5) && distance < (radiusCast + 0.5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
