package Thread;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.*;

public class ColecoesparaConcorrencia {

    //private static List<String> lista = new CopyOnWriteArrayList<>();
   // private static Map<Integer, String> mapa = new ConcurrentHashMap<>();
    private static BlockingQueue<String> fila = new LinkedBlockingDeque<>();

    public static void main(String[] args) throws InterruptedException {
        //colecao que sao Thread-safe

        MeuRunnable runnable = new MeuRunnable();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t0.start();
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(fila);
    }

    public static class MeuRunnable implements Runnable {
        @Override
        public void run() {
            //lista.add("O que é, o que é...");
            //mapa.put(new Random().nextInt(), "O que é, o que é");
            fila.add("O que é o que é");
            String name = Thread.currentThread().getName();
            System.out.println(name + "Inseriu na lista!");

        }
    }
}
