package BearShopExercise;

public class main {
    public static void main(String[] args) {
        BearShop shop1 = new BearShop();
        BearShop shop2 = new BearShop();

        for (int i = 0; i < 4; i++) {
            Bear bear1 = shop1.createBear();
            bear1.talk();

            Bear bear2 = shop2.createBear();
            bear2.talk();
        }

        BearShop.compareShops(shop1, shop2);
    }
}