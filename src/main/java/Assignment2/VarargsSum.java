package Assignment2;

public class VarargsSum {

    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total = total + num;
        }
        return total;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 2 numbers : " + sum(10, 20));
        System.out.println("Sum of 3 numbers : " + sum(10, 20, 30));
        System.out.println("Sum of 5 numbers : " + sum(10, 20, 30, 40, 50));
        System.out.println("Sum of no numbers : " + sum());
    }
}
