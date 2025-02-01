package design.pattern.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Create a Modern Furniture Factory
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        CoffeeTable modernTable = modernFactory.createCoffeeTable();

        // Use the modern furniture
        modernChair.sitOn();
        modernChair.hasLegs();
        modernTable.hasLegs();
        modernTable.shape();

        System.out.println();

        // Create a Victorian Furniture Factory
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        CoffeeTable victorianTable = victorianFactory.createCoffeeTable();

        // Use the victorian furniture
        victorianChair.sitOn();
        victorianChair.hasLegs();
        victorianTable.hasLegs();
        victorianTable.shape();
    }
}