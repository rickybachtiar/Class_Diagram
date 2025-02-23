class Processor {
    private String brand;

    public Processor(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Computer {
    private String model;
    private Processor processor; // Aggregation

    public Computer(String model, Processor processor) {
        this.model = model;
        this.processor = processor;
    }

    public void displayInfo() {
        System.out.println("Computer Model: " + model);
        System.out.println("Processor Brand: " + processor.getBrand());
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i7");
        Computer computer = new Computer("Dell XPS", processor);
        computer.displayInfo();
    }
}
