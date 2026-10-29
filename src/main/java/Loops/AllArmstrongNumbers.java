package Loops;

public class AllArmstrongNumbers {

    public static void main(String[] args) {

        for (int num = 1; num <= 1000; num++) {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem * rem;
                temp /= 10;
            }

            if (sum == num)
                System.out.print(num + " ");
        }
    }



}
