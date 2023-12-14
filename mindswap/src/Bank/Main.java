package Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Abrindo contas
        CreditAccount creditAccount = bank.openCreditAccount(100);
        DebitAccount debitAccount = bank.openDebitAccount();

        // Realizando operações
        creditAccount.deposit(50);
        debitAccount.deposit(200);
        debitAccount.deposit(10);
        debitAccount.withdraw(30);
        creditAccount.makePayment(120);
    }
}