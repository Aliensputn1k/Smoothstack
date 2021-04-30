package org.smoothstack.selfdirectedlearning.javabasics3.assignment1;


import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Main {

    public static List<File> getFiles(String directory, List<File> totalFiles) {
        File baseDirectory = new File(directory);
        File[] files = baseDirectory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    totalFiles.add(file);
                } else if (file.isDirectory()) {
                    getFiles(file.getAbsolutePath(), totalFiles);
                }
            }
        }
        
        return totalFiles;
    }

    public static void main(String args[]) {
        if (args.length == 1) {
            List<File> files = new ArrayList<File>();
            getFiles(args[0], files);

            for (File file : files) {
                System.out.println(file);
            }
        }
    }
}
