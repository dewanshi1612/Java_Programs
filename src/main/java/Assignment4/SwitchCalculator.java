package Assignment4;

public class SwitchCalculator {

    public static void main(String[] args) {

        double a = 20;
        double b = 0;
        char operator = '/';

        switch (operator) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println(" Division by zero is not allowed");
                } else {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid operator. Use +, -, *, /");
        }
    }
}
