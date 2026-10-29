package Assignment7;

interface Payment {
    void pay();
}

class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made successfully using UPI.");
    }
}

public class Main {
    public static void main(String[] args) {
        UPI obj = new UPI();
        obj.pay();
    }
}
