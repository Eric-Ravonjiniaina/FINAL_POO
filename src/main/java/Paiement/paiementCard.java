package Paiement;

public class paiementCard extends pay{
    private final String cardNumber;

    public paiementCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    @Override
    public boolean pay(float amount) {
        if (amount <= 0) {
            System.out.println("Error: Amount must be positive");
            return false;
        }
        if (cardNumber == null || cardNumber.isBlank()) {
            System.out.println("Error: Card number is required");
            return false;
        }
        return true;
    }
}
