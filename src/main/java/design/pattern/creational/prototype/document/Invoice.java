package design.pattern.creational.prototype.document;

// Concrete Prototype: Invoice
public class Invoice implements Document {
    private String content;

    public Invoice() {
        this.content = "Standard Invoice Content";
    }

    @Override
    public Document cloneDocument() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void displayContent() {
        System.out.println("Invoice Content: " + content);
    }
}
