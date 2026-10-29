package Loops;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 153;
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += rem * rem * rem;
            num /= 10;
        }

        if (temp == sum)
            System.out.println(temp + " is an Armstrong Number");
        else
            System.out.println(temp + " is not an Armstrong Number");
    }
}
