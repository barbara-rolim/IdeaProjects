package Restaurant;

import java.util.LinkedList;
import java.util.Queue;

public class Restaurant {
    private final Queue<Order> orders = new LinkedList<>();
    private final int MAX_ORDERS;
    private boolean isOpen = true;

    public Restaurant(int maxOrders) {
        this.MAX_ORDERS = maxOrders;
    }

    public void placeOrder(Order order) throws InterruptedException {
        synchronized (orders) {
            while (orders.size() == MAX_ORDERS) {
                orders.wait();
            }
            orders.add(order);
            orders.notifyAll();
        }
    }

    public Order takeOrder() throws InterruptedException {
        synchronized (orders) {
            while (orders.isEmpty() && isOpen) {
                orders.wait();
            }
            if (!orders.isEmpty()) {
                Order order = orders.poll();
                orders.notifyAll();
                return order;
            }
            return null;
        }
    }

    public void close() {
        synchronized (orders) {
            isOpen = false;
            orders.notifyAll();
        }
    }
}
