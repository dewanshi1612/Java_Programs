package Assignment2;

public class MethodOverloading {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        int intResult = obj.add(10, 20);
        double doubleResult = obj.add(10.5, 20.5);

        System.out.println("Integer Addition: " + intResult);
        System.out.println("Double Addition: " + doubleResult);
    }

}
