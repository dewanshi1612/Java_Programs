package Assignment3;

public class EvenOddTernary {

    public static void main(String[] args) {

        int number = 28;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);
    }
}
