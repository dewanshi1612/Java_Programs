package Assignment7;

class A {
    final void show() {
        System.out.println("Final method in class A");
    }

    void display() {
        System.out.println("Non-final method in class A");
    }
}

class B extends A {

    @Override
    void display() {
        System.out.println("Overridden display() in class B");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
}
