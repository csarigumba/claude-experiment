// Product
class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private boolean hasWifi;
    private boolean hasBluetooth;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.hasWifi = builder.hasWifi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                ", hasWifi=" + hasWifi +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }

    // Builder
    static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private boolean hasWifi;
        private boolean hasBluetooth;

        public Builder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

// Demo
public class BuilderPatternExample {
    public static void main(String[] args) {
        // Build a basic computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD")
                .build();

        System.out.println("Basic Computer: " + basicComputer);

        // Build a gaming computer with optional features
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
                .setGpu("NVIDIA RTX 4090")
                .setWifi(true)
                .setBluetooth(true)
                .build();

        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
