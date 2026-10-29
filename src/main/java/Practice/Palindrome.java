package Practice;

public class Palindrome {

    public static boolean isPalindrome(int num)
    {

        int reverse = 0;
        int temp = num;

        while(temp!=0)
        {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp/=10;
        }
        return num == reverse;
    }

    public static void main(String[] args) {

        int num = 121;
        if(isPalindrome(num))
            System.out.println("Palindrome Number:");
        else
            System.out.println("Not a Palindrome Number");
    }
}
