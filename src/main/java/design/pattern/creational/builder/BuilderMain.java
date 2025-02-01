package design.pattern.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder("Intel i9", 32, "1TB SSD")
                .setGPU("Nvidia RTX 4080")
                .setMotherboard("ASUS ROG")
                .build();

        System.out.println("CPU: " + myComputer.getCPU());
        System.out.println("RAM: " + myComputer.getRAM());
        System.out.println("Storage: " + myComputer.getStorage());
        System.out.println("GPU: " + myComputer.getGPU());
        System.out.println("Motherboard: " + myComputer.getMotherboard());
    }
}