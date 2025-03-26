package design.pattern.creational.factory;

public class BurgerOrder {
    public static void main(String[] args) {
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefRestaurant.orderBurger();

        Restaurant veggirRestaurant = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggirRestaurant.orderBurger();
    }
}
//https://www.youtube.com/playlist?list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc