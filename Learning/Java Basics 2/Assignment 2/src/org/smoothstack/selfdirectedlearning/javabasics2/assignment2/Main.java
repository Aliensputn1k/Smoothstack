package org.smoothstack.selfdirectedlearning.javabasics2.assignment2;

public class Main {

    public static void main(String[] args) {
        int row = 0;
        int column = 0;
        final int[][] VALUES = {
                {11, 42, 551, 64, 1024},
                {53, 12, 49821, 934, 95},
                {485, 12409, 305, 14, 10}
        };
        int highestValue = VALUES[row][column];

        for (int i = 0; i < VALUES.length; i++) {
            for (int j = 0; j < VALUES[i].length; j++) {
                if (highestValue < VALUES[i][j]) {
                    row = i;
                    column = j;
                    highestValue = VALUES[row][column];
                }
            }
        }

        System.out.println(highestValue + " -> " + "[" + row + "," + column + "]");
    }
}
