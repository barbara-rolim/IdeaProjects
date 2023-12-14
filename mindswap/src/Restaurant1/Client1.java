package Restaurant1;

public class Client1 {
    private int tableNumber;
    private int restaurantCount;
    private String order;

    public void askForTable(Restaurant1 restaurant) {
        Table1 table = restaurant.findTable();
        if (table != null) {
            tableNumber = table.getTableNumber();
            System.out.println("Customer seated at table " + tableNumber);
            return;
        }
        System.out.println("No available tables. Customer leaves.");
    }

    public void order(Restaurant1 restaurant, String item) {
        Table1 table = restaurant.getTable(tableNumber);
        if (table != null && !table.isFree()) {
            table.saveOrder(item);
            order = table.getOrder();
            System.out.println("Order placed for table " + table.getTableNumber() + ": " + order);
            restaurantCount++;
            return;
        }
        System.out.println("Invalid table or table is not occupied. Cannot place an order.");
    }

    public void pay(Restaurant1 restaurant) {
        Table1 table = restaurant.getTable(tableNumber);
        if (table != null) {
            String order = table.getOrder();
            System.out.println("Customer paid for the order: " + order);
            table.cleanOrder();
            restaurant.freeTable(table);
            System.out.println("Customer left the restaurant");
            return;
        }
        System.out.println("Customer cannot pay without ordering.");
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public String getOrder() {
        return order;
    }
}
