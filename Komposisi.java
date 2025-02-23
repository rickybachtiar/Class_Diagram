class Battery {
    private String capacity;

    public Battery(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }
}

class Smartphone {
    private String model;
    private Battery battery; // Composition

    public Smartphone(String model, String batteryCapacity) {
        this.model = model;
        this.battery = new Battery(batteryCapacity);
    }

    public void displayInfo() {
        System.out.println("Smartphone Model: " + model);
        System.out.println("Battery Capacity: " + battery.getCapacity());
    }
}

public class Komposisi {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("iPhone", "3000mAh");
        smartphone.displayInfo();
    }
}
