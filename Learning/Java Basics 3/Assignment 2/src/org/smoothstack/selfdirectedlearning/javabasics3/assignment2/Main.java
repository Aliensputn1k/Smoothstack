package org.smoothstack.selfdirectedlearning.javabasics3.assignment2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        if (args.length > 1) {
            try {
                FileWriter writer = new FileWriter(args[0]);
                List<String> data = new ArrayList<String>();
                CharSequence characters = "Hello World!";
                for (String arg : args) {
                    data.add(arg);
                }

                characters = String.join(" ", data);
                writer.append(characters);
                writer.close();
            } catch (IOException exception) {
                // { ... }
            }
        }
    }
}
