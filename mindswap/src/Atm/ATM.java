/*package Atm;

public class ATM {
    private Card currentCard;
    private Card amount;


    public void insertCard(Card card, Card pin, Card amount) {
        currentCard = card;
        this.amount = new amount;

        System.out.println("Cartão inserido: " + card.getCardNumber());
    }

    public void insertPin throws NotEnoughPermissionsException() {
        if (!currentCard.getPin()) {
            throw new RuntimeException("Pin Incorreto");
        }
        public void withdraw throws NotEnoughFundsException() {
            if (amount > currentCard.getBalance()) {
                throw new RuntimeException("Saldo insuficiente");
                return;
            }
            System.out.println("Saque de " + amount + " realizado com sucesso para a conta " + currentCard.getCardNumber());
            currentCard.setBalance(currentCard.getBalance() - amount);
        }
    }
}*/
