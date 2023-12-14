package BearShopExercise;

public class BearShop {
    private int numberOfBearsCreated;

    public Bear createBear() {
        numberOfBearsCreated++;

        if (numberOfBearsCreated % 5 == 0) {
            return new TheCrankyBear(100);
        } else if (numberOfBearsCreated % 2 == 0) {
            return new TheSimpleBear(100);
        } else {
            return new TheDrunkBear(100);
        }
    }

    public int getNumberOfBearsCreated() {
        return numberOfBearsCreated;
    }

    public static void compareShops(BearShop shop1, BearShop shop2) {
        if (shop1.getNumberOfBearsCreated() > shop2.getNumberOfBearsCreated()) {
            System.out.println("Shop 1 wins!");
        } else if (shop1.getNumberOfBearsCreated() < shop2.getNumberOfBearsCreated()) {
            System.out.println("Shop 2 wins!");
        } else {
            System.out.println("Both shops have created the same number of bears.");
        }
    }
}
