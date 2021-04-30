package org.smoothstack.selfdirectedlearning.javabasics2.assignment1;

public class Main {
    
    public static void main(String[] args) {
        double sum = 0.0;

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                try {
                    sum += Double.parseDouble(args[i]);
                } catch (NumberFormatException exception) {
                    // { ... }
                }
            }
        }

        System.out.println(sum);
    }
}