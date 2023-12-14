package Bank;

public class BankAccount {
    private static int nextCustomerId = 1;
    private String accountNumber;
    private int balance;
    private int customerId;
    private int amount;

    // Construtor
    public BankAccount() {
        this.customerId = generateCustomerId();
        this.amount = 0;
    }

    // Método para definir o número da conta
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Método para depositar dinheiro
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Depósito de " + amount + "€ realizado. Novo saldo: " + balance + "€");
    }

    // Método privado para gerar IDs únicos para clientes
    private static int generateCustomerId() {
        return nextCustomerId++;
    }
}