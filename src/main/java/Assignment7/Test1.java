package Assignment7;

abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Runs on fuel");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.fuelType();
    }
}
