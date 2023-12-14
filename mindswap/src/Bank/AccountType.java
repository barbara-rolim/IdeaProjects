package Bank;

public enum AccountType {

    DEBIT(100, true),

    CREDIT(2000, false);

    public final int miniValueToOpen;

    public final boolean canWithdraw;

    AccountType(int miniValueToOpen, boolean canWithdraw) {
        this.miniValueToOpen = miniValueToOpen;
        this.canWithdraw = canWithdraw;
    }

    public int getMiniValueToOpen() {
        return miniValueToOpen;
    }

}
