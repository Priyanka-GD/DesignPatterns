package design.pattern.structural.decorator;

// Component interface
interface Pizza {
    String getDescription();
    double getCost();
}

// Concrete component
class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}

// Decorator abstract class
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}

// Concrete decorators
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
}

class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}

// Usage
