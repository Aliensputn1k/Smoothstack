package com.smoothstack.learning.javabasics2.assignment2;

/**
 * @author  Jordan Searcy-Hosea <Aliensputn1k@outlook.com>
 * @brief   Source code for Smoothstack, Inc.'s Java Basics 2 homework -
 *          in collaboration with Certified Full-Stack Developer course
 *          materials.
 */

public class Main {
    public static void main(String[] args) {
        int sum = 0; // Sum of all user input values.

        /**
         * @section User Input Value Sum
         * @brief   Performs addition to all values passed by the user
         *          on the command line and returns it to the console.
         * @safety No exception handling present.
         */
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                try {
                    sum += Integer.parseInt(args[i]);
                } catch (NumberFormatException exception) {
                    /* Intentionally do nothing here and ignore anything non-numeric.
                     * The primary purpose of this try-catch clause is simply to prevent crashes.
                     */
                }
            }
        }
        System.out.println(sum);
    }
}
