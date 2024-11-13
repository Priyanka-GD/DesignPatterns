package design.pattern.creational.prototype.document;

// Client Code
public class DocumentPrototype {
    public static void main(String[] args) {
        Document reportPrototype = new Report();
        Document invoicePrototype = new Invoice();

        Document reportCopy = reportPrototype.cloneDocument();
        Document invoiceCopy = invoicePrototype.cloneDocument();

        reportCopy.displayContent();  // Displays standard report content
        invoiceCopy.displayContent(); // Displays standard invoice content
    }
}
