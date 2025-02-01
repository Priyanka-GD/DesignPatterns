package design.pattern.creational.abstractfactory;

public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
}

class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
      return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}