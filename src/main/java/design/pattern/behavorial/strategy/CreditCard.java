package design.pattern.behavorial.strategy;

public class CreditCard {
    private int cvv;
    private String expiryDate;
    private int cardNumber;
    private int amount;

    public CreditCard(int cvv, String expiryDate, int cardNumber) {
        this.amount = 1_00_000;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        this.cardNumber = cardNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
