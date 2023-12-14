package Bank;

public class Bank {
    private BankAccount[] accounts;
    private int numAccounts;
    private static int nextAccountNumber = 1;

    // Construtor
    public Bank() {
        this.accounts = new BankAccount[10];
        this.numAccounts = 0;
    }

    private String generateAccountNumber() {
        return "A" + nextAccountNumber++;
    }

    private void addAccount(BankAccount account) {
        account.setAccountNumber(generateAccountNumber());
        accounts[numAccounts] = account;
        numAccounts++;
    }

    public CreditAccount openCreditAccount(double creditLimit) {
        CreditAccount creditAccount = new CreditAccount(creditLimit);
        addAccount(creditAccount);
        return creditAccount;
    }

    // Método para abrir uma nova conta de débito
    public DebitAccount openDebitAccount() {
        DebitAccount debitAccount = new DebitAccount();
        addAccount(debitAccount);
        return debitAccount;
    }
}