package Restaurant;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(10); // Maximum 10 orders in queue
        Thread[] cooks = new Thread[3]; // 3 cooks
        Thread[] clients = new Thread[2]; // 2 clients

        for (int i = 0; i < cooks.length; i++) {
            cooks[i] = new Thread(new Cook(restaurant, i));
            cooks[i].start();
        }

        for (int i = 0; i < clients.length; i++) {
            clients[i] = new Thread(new Client(restaurant, i));
            clients[i].start();
        }

        try {
            Thread.sleep(15000); // Let the simulation run for a while
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (Thread cook : cooks) {
            cook.interrupt();
        }
        restaurant.close(); // Close the restaurant, causing clients to stop when orders run out
    }
}

