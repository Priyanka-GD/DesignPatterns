package design.pattern.creational.factory;

public interface Burger {
    void prepare();
}

class BeefBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Beef Burger");
    }
}

class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Veggie Burger");
    }
}

abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}

class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}

class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}

