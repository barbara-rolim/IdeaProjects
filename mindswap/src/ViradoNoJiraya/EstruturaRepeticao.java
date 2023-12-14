package ViradoNoJiraya;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        /*for (int i = 0; i <= 100000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
*/
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
