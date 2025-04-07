package design.pattern.behavorial.observer.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface PaymentStrategy {
    boolean pay(int amount);

    void collectPayment();
}

class PaypalStrategy implements PaymentStrategy {
    private boolean isSignedIn;
    private String email;
    private String password;
    private static final Map<String, String> DATABASE_MAP = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    static {
        DATABASE_MAP.put("xyz@gmail.com", "xyz");
        DATABASE_MAP.put("sdk@gmail.com", "sdk");
    }

    @Override
    public boolean pay(int amount) {
        if (isSignedIn) {
            System.out.println("Payment done using paypal worth amount " + amount);
            return true;
        } else {
            System.out.println("Payment failed");
            return false;
        }
    }

    @Override
    public void collectPayment() {
        try {
            while (!isSignedIn) {
                System.out.println("Enter email : ");
                email = scanner.next();
                System.out.println("Enter Password : ");
                password = scanner.next();
                if (verify())
                    System.out.println("Data succesfully verified.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(DATABASE_MAP.get(email).equals(password));
        return isSignedIn;
    }

    public boolean isSignedIn() {
        return isSignedIn;
    }

    public void setSignedIn(boolean signedIn) {
        isSignedIn = signedIn;
    }
}

class CreditCardStrategy implements PaymentStrategy {
    private CreditCard card;
    Scanner scanner = new Scanner(System.in);

    @Override
    public boolean pay(int amount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + amount + " using Credit Card.");
            card.setAmount(card.getAmount() - amount);
            return true;
        } else {
            System.out.println("Payment failed");
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }

    @Override
    public void collectPayment() {
        try {
            System.out.println("Enter Card Number : ");
            int cardNo = scanner.nextInt();
            System.out.println("Enter CVV Number : ");
            int cvv = scanner.nextInt();
            System.out.println("Enter Expiry Date : ");
            String date = scanner.next();
            CreditCard creditCard = new CreditCard(cvv, date, cardNo);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
