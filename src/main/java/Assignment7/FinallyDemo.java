package Assignment7;

public class FinallyDemo {
    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");

            int result = 10 / 0;

            System.out.println("This statement will not execute");
        }
        catch (ArithmeticException e) {
            System.out.println("Inside catch block");
            System.out.println("Exception: " + e);
        }
        finally {
            System.out.println("Inside finally block");
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
