package Paiement;

public class paiementMobile extends pay{
    private final String phoneNumber;

    public paiementMobile(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public boolean pay(float amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return false;
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            System.out.println("Phone number is required");
            return false;
        }
        return true;
    }
}
