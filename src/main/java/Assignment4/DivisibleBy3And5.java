package Assignment4;

public class DivisibleBy3And5 {

    public static void main(String[] args) {

        int number = 15;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5");
        } else if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3 only");
        } else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5 only");
        } else {
            System.out.println(number + " is not divisible by 3 or 5");
        }
    }
}
