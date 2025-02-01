package design.pattern.creational.abstractfactory;

public interface CoffeeTable {
    void hasLegs();
    void shape();
}

class ModernCoffeeTable implements CoffeeTable{

    @Override
    public void hasLegs() {
        System.out.println("Modern CoffeeTable has legs");
    }

    @Override
    public void shape() {
        System.out.println("Modern CoffeeTable shape");
    }
}

class VictorianCoffeeTable implements CoffeeTable{

    @Override
    public void hasLegs() {
        System.out.println("Victorian CoffeeTable has legs");
    }

    @Override
    public void shape() {
        System.out.println("Victorian CoffeeTable shape");
    }
}