class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car {
    private String model;
    private Driver driver; // Association

    public Car(String model, Driver driver) {
        this.model = model;
        this.driver = driver;
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Driver Name: " + driver.getName());
    }
}

public class Asosiasi {
    public static void main(String[] args) {
        Driver driver = new Driver("Ricky Bachtiar");
        Car car = new Car("Hyundai Ionic5", driver);
        car.displayInfo();
    }
}
