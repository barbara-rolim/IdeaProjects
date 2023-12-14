package Restaurant1;

public class Restaurant1 {
    private int numberOfOccupiedTables;
    private Table1[] tables;
    private static int tableCounter = 1;
    private boolean fullCapacity;
    private int restaurantCount;

    public Restaurant1(int numberOfTables) {
        tables = new Table1[numberOfTables];
        for (int i = 0; i < numberOfTables; i++) {
            tables[i] = new Table1(tableCounter++);
            return;
        }
        fullCapacity = false;
    }

    public Table1 findTable() {
        for (int i = 0; i < tables.length; i++) {
            Table1 table = tables[i];
            if (table.isFree()) {
                return tables[i];
            }
        }
        System.out.println("No available tables.");
        return null; // caso nao tenha mesas disponíveis
    }

    public Table1 getTable(int tableNumber) {
        for (int i = 0; i < tables.length; i++) {
            Table1 table = tables[i];
            if (table.getTableNumber() == tableNumber) {
                return table;
            }
        }
        return null;
    }

    public void freeTable(Table1 table) {
        table.cleanOrder();
        table.unoccupy();
        numberOfOccupiedTables--;
        if (fullCapacity && numberOfOccupiedTables < tables.length) {
            fullCapacity = false;
        }
    }

    public void receiveOrder(Table1 table) {
        if (!fullCapacity) {
            table.occupy();
            numberOfOccupiedTables++;
            restaurantCount++;

            if (numberOfOccupiedTables == tables.length) {
                fullCapacity = true;
            }
            return; // Remova esse return, já que queremos continuar a execução mesmo se o restaurante não estiver cheio.
        }
        System.out.println("Restaurant is at full capacity. Cannot receive more orders.");
    }

    public int getRestaurantCount() {
        return tableCounter++;
    }
}



