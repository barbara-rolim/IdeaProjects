package Bank;

class DebitAccount extends BankAccount {
    private int balance = 100;

    // Construtor
    public DebitAccount() {
        setAccountNumber("D123");
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            // Verificar se há saldo suficiente
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Saque de " + amount + "€ realizado. Novo saldo: " + balance + "€");
                return;
            }
        }
        System.out.println("Saldo insuficiente para saque.");
    }

    @Override
    public void deposit(int amount) {
        super.deposit(amount);  // Chama o método deposit da classe pai
        System.out.println("Depósito na conta de débito.");
    }
}
