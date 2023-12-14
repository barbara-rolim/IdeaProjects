package Javaio;

public class Main {
    public static void main(String[] args) {

        FileApp.FilterDir dir = new FileApp.FilterDir();

        FileApp fileApp = new FileApp();

        FileApp.FilterDirNonStatic nonStatic = fileApp.new FilterDirNonStatic();
    }
}