package org.example.creationalpattern.factory;

public class MainApplication {
    public static void main(String[] args) {
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefRestaurant.orderBurger();

        Restaurant veggirRestaurant = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggirRestaurant.orderBurger();
    }
}
