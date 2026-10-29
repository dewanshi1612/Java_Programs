package Practice;

public class FibSeries {

    public static void PrintFibSeries(int num,int a,int b)
    {
        int n = 7;

        for(int i =2; i<n;i++)
        {
            int next = a + b;
            System.out.print(next+ " ");
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {

        int a = 0, b = 1;
        System.out.print("Fib Series:" + a+ " " + b+ " ");
        FibSeries.PrintFibSeries(7,a,b);
    }
}

