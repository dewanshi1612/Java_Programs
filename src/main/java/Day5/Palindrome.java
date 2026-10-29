package Day5;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int reverse = 0;

        int temp = num;
        while(temp!=0)
        {
            int digit = temp % 10;
            reverse = reverse*10+digit;
            temp/=10;
        }
        if(num==reverse)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
