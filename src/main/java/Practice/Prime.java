package Practice;

public class Prime {

    public static boolean isPrime(int num)
    {
        boolean isPrime = true;

        if(num<=1)
        {
            return false;
        }

        for(int i =2 ; i < num ; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int num = 7;

        if(isPrime(num))
            System.out.println("prime");
        else
            System.out.println("not Prime");
    }
}
