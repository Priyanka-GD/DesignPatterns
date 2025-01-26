package design.pattern.structural.adapter;

// Target Interface
interface Printer {
    void print();
}

// Adaptee
class LegacyPrinter {
    void printDocument() {
        System.out.println("Legacy Printer is printing a document.");
    }
}

// Adapter
class PrinterAdapter implements Printer {
    private LegacyPrinter legacyPrinter;

    // Constructor
    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        legacyPrinter.printDocument();
    }
}


