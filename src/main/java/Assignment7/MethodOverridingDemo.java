package Assignment7;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
public class MethodOverridingDemo {

    public static void main(String[] args) {

        Animal obj = new Dog();
        obj.makeSound();
    }
}
