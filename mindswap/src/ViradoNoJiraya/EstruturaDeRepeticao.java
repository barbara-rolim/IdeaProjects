package ViradoNoJiraya;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count++);
        }

        count = 0;
        do {
            System.out.println("dentro do while " + count++);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
