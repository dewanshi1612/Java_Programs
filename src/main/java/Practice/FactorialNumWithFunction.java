package Practice;

public class FactorialNumWithFunction {

    public static int getFactorial(int num)
    {
        int fact = 1;
        for(int i = 1; i<=num; i++)
        {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int num = 5;
        int FactData = FactorialNumWithFunction.getFactorial(num);
        System.out.println("Factorial of a Number:" + FactData);
    }
}
