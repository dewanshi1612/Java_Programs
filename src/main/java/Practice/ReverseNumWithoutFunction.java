package Practice;

public class ReverseNumWithoutFunction {

    public static void main(String[] args) {

        int num = 1234;
        int temp = num;
        int reverse = 0;

        while(temp!=0)
        {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp/=10;

            System.out.println("Reverse :: " + reverse);
        }
    }
}
