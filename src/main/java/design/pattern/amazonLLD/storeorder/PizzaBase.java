package design.pattern.amazonLLD.storeorder;

public class PizzaBase implements OrderItem {
    String baseName;
    double price;

    public PizzaBase(String name, double price) {
        this.baseName = name;
        this.price = price;
    }

    public String getName() {
        return baseName;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
