package Practice;

public class PalindromeNumWithoutFunction {

    public static void main(String[] args) {

        int num = 121;
        int temp = num;
        int reverse = 0;

        while(temp!=0)
        {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp/=10;
        }

        if(num==reverse)
        {
            System.out.println("Palindrom number is:");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}
