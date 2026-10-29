package Day5;

public class FactorialWithFunction {

    //With Function

    public int getFactorial(int num)
    {
        int fact = 1;
        for(int i=1; i<=num; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        FactorialWithFunction obj = new FactorialWithFunction();
        int factData = obj.getFactorial(num);
        System.out.println("Factorial of a number is : "+factData);
    }
}
