package Assignment4;
import java.util.Scanner;

public class CheckRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 10 && num <= 50) {
            System.out.println("Number is within the range 10 to 50.");
        } else {
            System.out.println("Number is outside the range 10 to 50.");
        }

        sc.close();
    }
}
