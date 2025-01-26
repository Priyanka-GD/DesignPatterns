package design.pattern.structural.proxy;

// Interface for the real object and proxy
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// Real object: Bank account
class RealBankAccount implements BankAccount {
    private double balance;

    public RealBankAccount() {
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}

// Proxy: Credit/debit card
class ProxyBankAccount implements BankAccount {
    private RealBankAccount realBankAccount;
    private String cardNumber;
    private int pin;

    public ProxyBankAccount(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.realBankAccount = new RealBankAccount();
    }

    @Override
    public void deposit(double amount) {
        // Additional logic, e.g., logging, security checks
        realBankAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        // Additional logic, e.g., logging, security checks, authentication
        realBankAccount.withdraw(amount);
    }

    @Override
    public double getBalance() {
        // Additional logic, e.g., logging, security checks
        return realBankAccount.getBalance();
    }

    public boolean authenticate(int pin) {
        return this.pin == pin;
    }
}

// Client code

