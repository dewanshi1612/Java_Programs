package Practice;

public class FactorialWithoutFunction {

    public static void main(String[] args) {

        int num = 5;
        int fact = 1;

        for(int i = 1; i<=num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial number is::" + fact);
    }
}
