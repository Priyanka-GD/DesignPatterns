package design.pattern.creational.builder;

class Computer {
    private String CPU;
    private int RAM;
    private String storage;
    private String GPU;
    private String motherboard;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.motherboard = builder.motherboard;
    }

    // Getters
    public String getCPU() { return CPU; }
    public int getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGPU() { return GPU; }
    public String getMotherboard() { return motherboard; }

    public static class Builder {
        private String CPU;
        private int RAM;
        private String storage;
        private String GPU;
        private String motherboard;

        public Builder(String CPU, int RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

