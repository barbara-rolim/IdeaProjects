package Bank;

public class CreditAccount extends BankAccount {
    private double creditLimit;
    private int balance = 100;

    // Construtor (sem número da conta)
    public CreditAccount(double creditLimit) {
        setAccountNumber("D321");
        this.creditLimit = creditLimit;
    }

    // Método para fazer pagamento
    public void makePayment(int amount) {
        if (balance - amount >= -creditLimit) {
            balance -= amount;
            System.out.println("Pagamento de " + amount + "€ realizado. Novo saldo: " + balance + "€");
            return;
        }
        System.out.println("Pagamento excede o limite de crédito.");
    }

    @Override
    public void deposit(int amount) {
        super.deposit(amount);  // Chama o método deposit da classe pai
        System.out.println("Depósito na conta de crédito.");
    }
}