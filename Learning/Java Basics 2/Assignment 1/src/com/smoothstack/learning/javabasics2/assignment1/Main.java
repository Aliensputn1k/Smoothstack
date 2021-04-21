package com.smoothstack.learning.javabasics2.assignment1;

/**
 * @author  Jordan Searcy-Hosea <Aliensputn1k@outlook.com>
 * @brief   Source code for Smoothstack, Inc.'s Java Basics 2 homework -
 *          in collaboration with Certified Full-Stack Developer course
 *          materials.
 */

public class Main {
    public static void main(String[] args) {
        final int[][] ARRAY = {
                {1, 2, 3, 4, 5,},
                {11, 12, 13, 14, 15},
                {6, 7, 8, 9, 10}
        };                      // 2-dimensional numerical array used for iteration.
        int row = 0;            // Row where the maximum value is located.
        int column = 0;         // Column where the maximum value is located.
        int max = ARRAY[0][0];  // Holds the current maximum value found in the array.

        /**
         * @section 2d Array Highest Value Locator
         * @brief   Locates the highest value in a given 2d array
         *          then returns the value with its "coordinates" in the array.
         * @safety  No exception handling present.
         */
        for (int i = 0; i < ARRAY.length; i++) {
            for (int j = 0; j < ARRAY[i].length; j++) {
                if (max < ARRAY[i][j]) {
                    max = ARRAY[i][j];
                    row = i;
                    column = j;
                } else {
                    continue;
                }
            }
        }
        System.out.println(max + " located at [" + row + "," + column + "]");
    }
}
