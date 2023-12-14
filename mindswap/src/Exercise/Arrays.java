package Exercise;

public class Arrays {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        String[] myStringArray = new String[10];

        int[] myArrayDefined = {1, 3, 5, 7, 9, 1000};
        System.out.println(myArrayDefined[0]);
        System.out.println(myArrayDefined[5]);
        System.out.println(myArrayDefined[myArrayDefined.length -1]);
        printArray(myArrayDefined);
        printArrayReverse(myArrayDefined);
    }

    private static void printArray(int[] myArrayDefined) {
        for (int i = 0; i < myArrayDefined.length; i++) {
            System.out.println(myArrayDefined[i]);
        }
    }

    private static void printArrayReverse(int[] myArrayDefined) {
        for (int i = myArrayDefined.length - 1; i >= 0; i--) {
            System.out.println(myArrayDefined[i]);
        }
    }
}