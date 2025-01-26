package design.pattern.structural.adapter;

// Client Code
public class AdapterPatternExample {
    public static void clientCode(Printer printer) {
        printer.print();
    }

    public static void main(String[] args) {
        // Using the Adapter
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer adapter = new PrinterAdapter(legacyPrinter);
        clientCode(adapter);
    }
}