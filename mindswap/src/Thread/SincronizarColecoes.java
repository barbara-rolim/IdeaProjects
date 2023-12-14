package Thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SincronizarColecoes {
    private static List<String> lista = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException{
        lista = Collections.synchronizedList(lista);
        //utilize a versao do synchronizedXXXX de acordo com seu tipo de colecao;
        /*lista = Collections.synchronizedCollection(lista);
        lista = Collections.synchronizedMap(lista);
        lista = Collections.synchronizedSet(lista);*/


        MeuRunnable runnable = new MeuRunnable();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t0.start();
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(lista);
    }

    public static class MeuRunnable implements Runnable{
        @Override
        public void run() {
            lista.add("O que é, o que é...");
            String name = Thread.currentThread().getName();
            System.out.println(name + "Inseriu na lista!");

        }
    }
}
