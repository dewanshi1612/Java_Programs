package Assignment3;

public class OperatorPrecedence {

    public static void main(String[] args) {

        int a = 10;
        int b = 4;
        int c = 2;
        int result1 = a + b * c;
        System.out.println("a + b * c = " + result1);

        int result2 = (a + b) * c;
        System.out.println("(a + b) * c = " + result2);

        int result3 = a + b * c - 1;
        System.out.println("a + b * c - 1 = " + result3);

        int result4 = a * b / c + b % c;
        System.out.println("a * b / c + b%c = " + result4);

        boolean result5 = a > b && b > c;
        System.out.println("a > b && b > c = " + result5);
    }
}
