package Restaurant;

public class Client implements Runnable {
    private final Restaurant restaurant;
    private final int id;

    public Client(Restaurant restaurant, int id) {
        this.restaurant = restaurant;
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Order order = restaurant.takeOrder();
                if (order != null) {
                    System.out.println("Client " + id + " took order " + order.getId());
                    Thread.sleep(2000);
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
