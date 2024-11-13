package design.pattern.creational.prototype.document;

// Prototype Interface
public interface Document extends Cloneable {
    Document cloneDocument();
    void displayContent();
}
