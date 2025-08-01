package Thread;

import java.sql.SQLOutput;

public class Volatile {

    private static volatile int numero = 0;
    private static volatile boolean preparado = false; //da uma dica para o programa (escreva e leia o dado direto da memoria ram)

    private static class MeuRunnable implements Runnable {
        @Override
        public void run() {
            while (!preparado) {
                Thread.yield();
            }

            if (numero != 42) {
                System.out.println(numero);
                throw new IllegalStateException("Inscreva-se no canal");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread t0 = new Thread(new MeuRunnable());
            t0.start();
            Thread t1 = new Thread(new MeuRunnable());
            t1.start();
            Thread t2 = new Thread(new MeuRunnable());
            t2.start();

            numero = 42;
            preparado = true;

        while (
            t0.getState() != Thread.State.TERMINATED
            || t1.getState() != Thread.State.TERMINATED
            || t2.getState() != Thread.State.TERMINATED
            ) {
                //espera
            }

            numero = 0;
            preparado = false;
        }
    }
}
