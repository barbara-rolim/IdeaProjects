package Thread;

public class Thread_1 {
    public static void main(String[] args) {
        //Thread atual
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        //Nova thread
        Thread t1 = new Thread(new MeuRunnable());
        //t1.run(); //apenas executa na mesma thread
        t1.start(); //executa em uma nova thread

        //Runnable como lambda
        Thread t2 = new Thread(
                () -> System.out.println(Thread.currentThread().getName()));
        t2.start();

        //Várias threads
        Thread t3 = new Thread(new MeuRunnable());
        //t1.run(); //apenas executa na mesma thread
        t3.start(); //executa em uma nova thread
    }
}
