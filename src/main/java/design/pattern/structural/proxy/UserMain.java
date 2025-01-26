package design.pattern.structural.proxy;

public class UserMain {
    public static void main(String[] args) {
        ProxyBankAccount myCard = new ProxyBankAccount("1234567890", 1234);

        if (myCard.authenticate(1234)) {
            myCard.deposit(1000);
            myCard.withdraw(200);
            System.out.println("Balance: " + myCard.getBalance());
        } else {
            System.out.println("Authentication failed.");
        }
    }

}
