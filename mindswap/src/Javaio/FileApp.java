package Javaio;

import jdk.jfr.Experimental;

import java.io.*;

import java.io.*;

public class FileApp {


    public static void main(String[] args) {
        String[] filesInDirectory = new String[0];
        try {
            filesInDirectory = getFilesInDirectory(readFromConsole("Input Directory to list"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            writeFileNamesOnFile(filesInDirectory, readFromConsole("Type the name of the file to write the list."));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String readFromConsole(String message) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);
        return reader.readLine();
    }

    private static void writeFileNamesOnFile(String[] filenames, String newFileName) throws IOException {
        FileWriter writer = new FileWriter(newFileName);
        for (String filename : filenames) {
            if (filename == null) {
                break;
            }
            // System.out.println(filename.toLowerCase());
            writer.write(filename + "\n");
        }
        writer.close();
    }

    private static String[] getFilesInDirectory(String path) {
        File file = new File(path);

        FilterDir filterDir = new FilterDir();

        //FilterDirNonStatic filterDirNonStatic = new FilterDirNonStatic();

        FileFilter ff = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        };

        File[] files = file.listFiles(ff);
        String[] filesNames = new String[files.length];
        for (int i = 0; i < filesNames.length; i++) {
            filesNames[i] = files[i].getName();
        }
        return filesNames;
    }

    public static void createLocalClass() {
        class LocalClass {
            void display() {
                System.out.println("Yeiiii");
            }
        }
    }

    public static class FilterDir implements FileFilter {

        @Override
        public boolean accept(File pathname) {
            return pathname.isFile();
        }
    }

    public class FilterDirNonStatic implements FileFilter {

        @Override
        public boolean accept(File pathname) {
            return pathname.isFile();
        }
    }

}