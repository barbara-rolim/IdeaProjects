package Thread;

public class MeuRunnable implements Runnable {
    private static int i = 0;

    @Override
    //  public synchronized void run() {
    public void run() {
        int j;
        synchronized (this){
            i++;
            j = i * 2;
        }

        double jElevadoA100 = Math.pow(j, 100); //j elevado a 100
        double sqrt = Math.sqrt(jElevadoA100); //raiz quadrada
        System.out.println(sqrt);

    /*    Synchronized_1.imprime();
        synchronized (Lock1) {
            i++;
            String name = Thread.currentThread().getName();
            System.out.println(name + ":" + i);
        }
        synchronized (Lock2) {
            i++;
            String name = Thread.currentThread().getName();
            System.out.println(name + ":" + i);
        }*/
    }
}
