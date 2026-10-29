package Assignment6;

public class Car {

    Car() {
        System.out.println("Default Constructor Called");
    }

    Car(String brand) {
        this();
        System.out.println("Parameterized Constructor Called");
        System.out.println("Car Brand: " + brand);
    }

    public static void main(String[] args) {

        Car c1 = new Car("Toyota");
    }
}
