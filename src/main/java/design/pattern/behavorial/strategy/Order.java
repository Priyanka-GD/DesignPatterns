package design.pattern.behavorial.strategy;

public class Order {
    PaymentStrategy strategy;
    private int totalCost;
    private boolean isClosed = false;

    public void processOrder(PaymentStrategy strategy) {
        strategy.collectPayment();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = false;
    }
}
