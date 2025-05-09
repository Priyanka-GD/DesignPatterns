package design.pattern.structural.proxy;

public class ProxyPatternExample {
    public static void main (String[] args) {
        Image image = new ProxyImage("image.jpg");
        // Image will be loaded from disk only when display() is called
        image.display();
        // Image will not be loaded again, as it has been cached in the Proxy
        image.display();
    }
}