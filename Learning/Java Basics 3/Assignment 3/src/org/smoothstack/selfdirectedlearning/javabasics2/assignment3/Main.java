package org.smoothstack.selfdirectedlearning.javabasics2.assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (args.length >= 2) {
            File file = new File(args[0]);
            try {
                Scanner haystack = new Scanner(file);
                char needle = args[1].toCharArray()[0];
                int count = 0;

                while (haystack.hasNextLine()) {
                    String line = haystack.nextLine().toLowerCase();
                    for (int i = 0; i < line.length(); i++) {
                        if (line.charAt(i) == needle) {
                            count++;
                        }
                    }
                }

                System.out.println(count);
                haystack.close();
            } catch (FileNotFoundException exception) {
                // { ... }
            }
        }
    }
}
