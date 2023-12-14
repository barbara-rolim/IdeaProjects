package Restaurant1;

public class Table1 {
    private int tableNumber;
    private boolean free;
    private String order;

    public Table1(int tableNumber) {
        this.tableNumber = tableNumber;
        free = true;
        order = "Pizza e Coca Cola";
    }

    public String getOrder() {
        return order;
    }

    public void cleanOrder() {
        order = "";
    }

    public boolean isFree() {
        return free;
    }

    public void occupy() {
        free = false;
    }

    public void saveOrder(String newOrder) {
        if (free) {
            order = newOrder;
            System.out.println("Customer placed an order: " + order);
            return;
        }
        System.out.println("Cannot save order. Table is occupied.");
    }

    public void unoccupy() {
        free = true;
    }

    public int getTableNumber() {
        return tableNumber;
    }
}
