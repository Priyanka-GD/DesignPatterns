package org.example.creationalpattern.factory;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Veggie Burger");
    }
}
