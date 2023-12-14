package Restaurant;

import java.util.Random;

public class Cook implements Runnable {
    private final Restaurant restaurant;
    private final Random random;
    private final int id;

    public Cook(Restaurant restaurant, int id) {
        this.restaurant = restaurant;
        this.random = new Random();
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Order order = new Order(random.nextInt(100));
                restaurant.placeOrder(order);
                System.out.println("Cook " + id + " placed order " + order.getId());
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
