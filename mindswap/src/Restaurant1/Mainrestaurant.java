package Restaurant1;

public class Mainrestaurant {
    public static void main(String[] args) {

        Restaurant1 restaurant = new Restaurant1(5);
        Client1 customer = new Client1();
        Table1 table = new Table1(1);
        System.out.println("Customer enters the restaurant.");
        customer.askForTable(restaurant);
        int tableNumber = customer.getTableNumber();
        table.saveOrder(table.getOrder());
        System.out.println("Order is saved.");
        customer.pay(restaurant);
        restaurant.freeTable(new Table1(1));
        System.out.println("Table is freed.");
        table.cleanOrder();
        table.unoccupy();
        System.out.println("Is the table free? " + table.isFree());
        int totalOrders = restaurant.getRestaurantCount();
        System.out.println("Total orders received by the restaurant: " + totalOrders);
        //int freeTables = table.getTableNumber();
        //System.out.println("Number of free tables: " + freeTables);
    }
}