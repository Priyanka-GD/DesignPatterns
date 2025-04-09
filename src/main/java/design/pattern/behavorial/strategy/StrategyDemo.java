package design.pattern.behavorial.strategy;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StrategyDemo {
    private static final Map<Integer, Integer> DATABASE_PRICES = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static PaymentStrategy paymentStrategy;
    static Order order = new Order();

    static {
        DATABASE_PRICES.put(1, 1000);
        DATABASE_PRICES.put(2, 2000);
        DATABASE_PRICES.put(3, 1500);
        DATABASE_PRICES.put(4, 1200);
    }

    public static void main(String[] args) throws IOException {
        try {
            while (!order.isClosed()) {
                String continueChoice;
                do {
                    System.out.print("Please, select a product:" + "\n" +
                            "1 - Lamp" + "\n" +
                            "2 - Stand Lamp" + "\n" +
                            "3 - Study Lamp" + "\n" +
                            "4 - LED Lamp" + "\n");
                    int choice = scanner.nextInt();
                    int cost = DATABASE_PRICES.get(choice);
                    System.out.println("Count : ");
                    int count = scanner.nextInt();
                    order.setTotalCost(cost * count);
                    System.out.print("Do you wish to continue selecting products? Y/N: ");
                    continueChoice = scanner.next();
                } while (continueChoice.equalsIgnoreCase("Y"));
                if (paymentStrategy == null) {
                    System.out.println("Please, select a payment method:" + "\n" +
                            "1 - PayPal" + "\n" +
                            "2 - Credit Card");
                    String paymentMethod = scanner.next();

                    // Client creates different strategies based on input from user,
                    // application configuration, etc.
                    if (paymentMethod.equals("1")) {
                        paymentStrategy = new PaypalStrategy();
                    } else {
                        paymentStrategy = new CreditCardStrategy();
                    }
                    order.processOrder(paymentStrategy);

                    System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
                    String proceed = scanner.next();

                    if (proceed.equals("P")) {
                        if (paymentStrategy.pay(order.getTotalCost()))
                            System.out.println("Payment has been successful.");
                    } else {
                        System.out.println("FAIL! Please, check your data.");
                    }
                    order.setClosed();
                }
            }
        } catch (Exception ex) {
            System.out.println("Wrong Input provided");
        }
    }

}
