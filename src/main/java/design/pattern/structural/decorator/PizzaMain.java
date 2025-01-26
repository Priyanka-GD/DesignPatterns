package design.pattern.structural.decorator;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza1 = new PlainPizza();
        System.out.println(pizza1.getDescription() + " Cost: $" + pizza1.getCost());

        Pizza pizza2 = new CheeseDecorator(new PlainPizza());
        System.out.println(pizza2.getDescription() + " Cost: $" + pizza2.getCost());

        Pizza pizza3 = new PepperoniDecorator(new CheeseDecorator(new PlainPizza()));
        System.out.println(pizza3.getDescription() + " Cost: $" + pizza3.getCost());
    }
}