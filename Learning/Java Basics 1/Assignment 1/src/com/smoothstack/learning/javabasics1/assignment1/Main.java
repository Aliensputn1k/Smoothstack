package com.smoothstack.learning.javabasics1.assignment1;

/**
 * @author  Jordan Searcy-Hosea <Aliensputn1k@outlook.com>
 * @brief   Source code for Smoothstack, Inc.'s Java Basics 1 homework -
 *          in collaboration with Certified Full-Stack Developer course
 *          materials.
 */

public class Main {
    public static void main(String[] args) {
        final int MAX_ROWS = 4; // Monitors the maximum height limit of the shapes.

        /**
         * @section Shape No.1 Controller
         * @brief   Code that prints the following shape, specified by Smoothstack, Inc.
         *       -> *
         *       -> **
         *       -> ***
         *       -> ****
         * @safety  No exception handling present.
         */
        for (int row = 0; row < MAX_ROWS; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("----------");

        /**
         * @section Shape No.2 Controller
         * @brief   Code that prints the following shape, specified by Smoothstack, Inc.
         *       -> ****
         *       -> ***
         *       -> **
         *       -> *
         * @safety  No exception handling present.
         */
        int count = MAX_ROWS;
        for (int row = 0; row < MAX_ROWS; row++) {
            for (int column = count; column > row; column--) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("----------");

        /**
         * @section Shape No.3 Controller
         * @brief   Code that prints the following shape, specified by Smoothstack, Inc.
         *       ->    *
         *       ->   ***
         *       ->  *****
         *       -> *******
         * @safety  No exception handling present.
         */
        int spaces = 3;
        count = 1;
        for (int row = 0; row < MAX_ROWS; row++) {
            for (int column = 0; column < spaces; column++) {
                System.out.print(' ');
            }

            for (int column = count; column > 0; column--) {
                System.out.print('*');
            }

            spaces--;
            count += 2;

            System.out.println();
        }
        System.out.println("----------");

        /**
         * @section Shape No.4 Controller
         * @brief   Code that prints the following shape, specified by Smoothstack, Inc.
         *       -> *******
         *       ->  *****
         *       ->   ***
         *       ->    *
         * @safety  No exception handling present.
         */
        spaces = 0;
        count = 7;
        for (int row = 0; row < MAX_ROWS; row++) {
            for (int column = 0; column < spaces; column++) {
                System.out.print(' ');
            }

            for (int column = count; column > 0; column--) {
                System.out.print('*');
            }
            spaces++;
            count -= 2;

            System.out.println();
        }
    }
}
