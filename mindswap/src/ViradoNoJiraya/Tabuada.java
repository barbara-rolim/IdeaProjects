package ViradoNoJiraya;

import static java.lang.System.*;

public class Tabuada {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            out.println("Fazendo tabuada dos numeros " + i);
            for (int j = 1; j <= 10; j++) {
                out.println(i + "x" + j + " = " + (i*j));
            }
        }
    }
}
