package Assignment7;

class Person {
    String name = "Parent";
}

class Student extends Person {
    String name = "Child";

    void display() {
        System.out.println("Child Name : " + name);
        System.out.println("Parent Name : " + super.name);
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
