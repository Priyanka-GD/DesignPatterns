package design.pattern.creational.prototype.document;

// Concrete Prototype: Report
public class Report implements Document {
    private String content;

    public Report() {
        this.content = "Standard Report Content";
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
        System.out.println("Report Content: " + content);
    }
}
