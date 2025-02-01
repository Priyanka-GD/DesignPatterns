package design.pattern.creational.factory;

public class BeefBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Beef Burger");
    }
}
