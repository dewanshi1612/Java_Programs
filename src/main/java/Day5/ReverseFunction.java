package Day5;

public class ReverseFunction {

    public static int getReverse(int num)
    {
        int reverse = 0;
        int temp = num;
        while(temp!=0)
        {
            int digit = temp % 10;
            reverse = reverse*10+digit;
            temp/=10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int num = 2345;
        int reverseData = getReverse(num);
        System.out.println("Reverse : "+ reverseData);

    }
}
